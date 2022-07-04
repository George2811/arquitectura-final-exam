package com.example.arquiefinal.service;

import com.example.arquiefinal.domain.model.Hotel;
import com.example.arquiefinal.domain.repository.HotelRepository;
import com.example.arquiefinal.domain.service.HotelService;
import com.example.arquiefinal.exception.ResourceNotFoundException;
import com.example.arquiefinal.resource.SaveHotelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotelsReservations() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel createHotelReservation(SaveHotelResource hotel) {
        Hotel newReservation = new Hotel(
                hotel.getRequestId(),
                hotel.getHotelName(),
                hotel.getLocation(),
                hotel.getArrivalDate(),
                hotel.getExitDate(),
                hotel.getCost()
        );
        if(hotelRepository.existsHotelByRequestIdAndHotelName(hotel.getRequestId(), hotel.getHotelName()))
            throw new ResourceNotFoundException("La solicitud ya cuenta con reservación en este hotel");

        if(hotel.getExitDate().before(hotel.getArrivalDate()))
            throw new ResourceNotFoundException("La fecha de salida es mayor a la de entrada");
        return hotelRepository.save(newReservation);
    }
}
