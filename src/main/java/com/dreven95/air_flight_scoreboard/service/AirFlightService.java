package com.dreven95.air_flight_scoreboard.service;

import com.dreven95.air_flight_scoreboard.entity.AirFlight;

import java.util.List;

public interface AirFlightService {
    public List<AirFlight> getAllAirFlights();
    public void saveAirFlight(AirFlight airFlight);
    public AirFlight getAirFlight(int id);
    public void deleteAirFlight(int id);
}
