package com.example.arquiefinal.resource;

import javax.persistence.*;
import java.util.Calendar;

public class SaveHotelResource {
    private Long requestId;
    private String hotelName;
    private String location;
    private Calendar arrivalDate;
    private Calendar exitDate;
    private double cost;

    public Long getRequestId() {
        return requestId;
    }
    public SaveHotelResource setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getHotelName() {
        return hotelName;
    }
    public SaveHotelResource setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public String getLocation() {
        return location;
    }
    public SaveHotelResource setLocation(String location) {
        this.location = location;
        return this;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }
    public SaveHotelResource setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    public Calendar getExitDate() {
        return exitDate;
    }
    public SaveHotelResource setExitDate(Calendar exitDate) {
        this.exitDate = exitDate;
        return this;
    }

    public double getCost() {
        return cost;
    }
    public SaveHotelResource setCost(double cost) {
        this.cost = cost;
        return this;
    }
}
