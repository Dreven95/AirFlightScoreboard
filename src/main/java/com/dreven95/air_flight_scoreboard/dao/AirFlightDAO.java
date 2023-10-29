package com.dreven95.air_flight_scoreboard.dao;

import com.dreven95.air_flight_scoreboard.entity.AirFlight;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AirFlightDAO {
    public List<AirFlight> getAllAirFlights();
    public void saveAirFlight(AirFlight airFlight);
    public AirFlight getAirFlight(int id);
    public void deleteAirFlight(int id);
}
