package com.example.arquiefinal.domain.service;

import com.example.arquiefinal.domain.model.Hotel;
import com.example.arquiefinal.resource.SaveHotelResource;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotelsReservations();
    Hotel createHotelReservation(SaveHotelResource hotel);
}
