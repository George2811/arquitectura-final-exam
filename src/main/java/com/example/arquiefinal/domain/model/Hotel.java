package com.example.arquiefinal.domain.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "examples")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long requestId;

    @Column(nullable = false)
    private String hotelName;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar arrivalDate;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar exitDate;

    @Column(nullable = false, scale = 2)
    private double cost;

    public Hotel() {
    }
    public Hotel(Long id, Long requestId, String hotelName, String location, Calendar arrivalDate, Calendar exitDate, double cost) {
        this.id = id;
        this.requestId = requestId;
        this.hotelName = hotelName;
        this.location = location;
        this.arrivalDate = arrivalDate;
        this.exitDate = exitDate;
        this.cost = cost;
    }
    public Hotel(Long requestId, String hotelName, String location, Calendar arrivalDate, Calendar exitDate, double cost) {
        this.requestId = requestId;
        this.hotelName = hotelName;
        this.location = location;
        this.arrivalDate = arrivalDate;
        this.exitDate = exitDate;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }
    public Hotel setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRequestId() {
        return requestId;
    }
    public Hotel setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getHotelName() {
        return hotelName;
    }
    public Hotel setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public String getLocation() {
        return location;
    }
    public Hotel setLocation(String location) {
        this.location = location;
        return this;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }
    public Hotel setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    public Calendar getExitDate() {
        return exitDate;
    }
    public Hotel setExitDate(Calendar exitDate) {
        this.exitDate = exitDate;
        return this;
    }

    public double getCost() {
        return cost;
    }
    public Hotel setCost(double cost) {
        this.cost = cost;
        return this;
    }
}
