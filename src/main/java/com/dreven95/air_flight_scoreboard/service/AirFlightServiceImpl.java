package com.dreven95.air_flight_scoreboard.service;

import com.dreven95.air_flight_scoreboard.dao.AirFlightDAO;
import com.dreven95.air_flight_scoreboard.entity.AirFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AirFlightServiceImpl implements AirFlightService {
    @Autowired
    private AirFlightDAO airFlightDAO;
    @Override
    @Transactional
    public List<AirFlight> getAllAirFlights() {
        return airFlightDAO.getAllAirFlights();
    }

    @Override
    @Transactional
    public void saveAirFlight(AirFlight airFlight) {
        airFlightDAO.saveAirFlight(airFlight);
    }

    @Override
    @Transactional
    public AirFlight getAirFlight(int id) {
        return airFlightDAO.getAirFlight(id);
    }

    @Override
    @Transactional
    public void deleteAirFlight(int id) {
        airFlightDAO.deleteAirFlight(id);
    }
}
