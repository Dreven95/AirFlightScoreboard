package com.dreven95.air_flight_scoreboard.dao;

import com.dreven95.air_flight_scoreboard.entity.AirFlight;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirFlightDAOImpl implements AirFlightDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<AirFlight> getAllAirFlights() {
        Session session = sessionFactory.getCurrentSession();
        List<AirFlight> allAirFlights = session.createQuery("from AirFlight", AirFlight.class)
                .getResultList();
        return allAirFlights;
    }

    @Override
    public AirFlight getAirFlight(int id) {
        Session session = sessionFactory.getCurrentSession();
        AirFlight airFlight = session.get(AirFlight.class, id);
        return airFlight;
    }

    @Override
    public void saveAirFlight(AirFlight airFlight) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(airFlight);
    }


    @Override
    public void deleteAirFlight(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<AirFlight> query = session.createQuery("delete from AirFlight " +
                "where id =: airFlightId");
        query.setParameter("airFlightId", id);
        query.executeUpdate();
    }
}
