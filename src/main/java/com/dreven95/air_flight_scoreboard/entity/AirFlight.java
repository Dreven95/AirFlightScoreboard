package com.dreven95.air_flight_scoreboard.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "air_flights")
public class AirFlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "where_from")
    private String whereFrom;
    @Column(name = "departure_time")
    private String departureTime;
    @Column(name = "where_to")
    private String whereTo;
    @Column(name = "boarding_time")
    private String boardingTime;
    @Column(name = "flight_status")
    private String flightStatus;

    public AirFlight() {
    }

    public AirFlight(int id, String whereFrom, String departureTime, String whereTo, String boardingTime, String flightStatus) {
        this.id = id;
        this.whereFrom = whereFrom;
        this.departureTime = departureTime;
        this.whereTo = whereTo;
        this.boardingTime = boardingTime;
        this.flightStatus = flightStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getWhereTo() {
        return whereTo;
    }

    public void setWhereTo(String whereTo) {
        this.whereTo = whereTo;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }
}
