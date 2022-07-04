package com.example.arquiefinal.domain.repository;

import com.example.arquiefinal.domain.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    boolean existsHotelByRequestIdAndHotelName(Long requestId, String hotelName);
}
