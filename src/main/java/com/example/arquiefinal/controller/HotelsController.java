package com.example.arquiefinal.controller;

import com.example.arquiefinal.domain.model.Hotel;
import com.example.arquiefinal.domain.service.HotelService;
import com.example.arquiefinal.resource.SaveHotelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HotelsController {

    @Autowired
    private HotelService hotelService;

    @Operation(summary = "Get All Hotel Reservations", description = "Get All Hotel Reservations", tags = {"HotelReservations"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Hotel Reservations returned", content = @Content(mediaType =
                    "application/json"))
    })
    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotelReservations(){
        try {
            return new ResponseEntity<>(hotelService.getAllHotelsReservations(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Operation(summary = "Post Hotel Reservation", description = "Create an Hotel Reservation", tags = {"HotelReservations"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = " Hotel Reservation registered", content = @Content(mediaType =
                    "application/json"))
    })
    @PostMapping("/hotels")
    public ResponseEntity<?> createHotelReservations(@Valid @RequestBody SaveHotelResource resource){
        try {
            return new ResponseEntity<>(hotelService.createHotelReservation(resource), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
