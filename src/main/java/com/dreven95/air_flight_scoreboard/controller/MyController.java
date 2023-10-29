package com.dreven95.air_flight_scoreboard.controller;

import com.dreven95.air_flight_scoreboard.entity.AirFlight;
import com.dreven95.air_flight_scoreboard.service.AirFlightService;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private AirFlightService airFlightService;

    @RequestMapping("/")
    public String showAllAirFlights(Model model) {
        List<AirFlight> allAirFlights = airFlightService.getAllAirFlights();
        model.addAttribute("allAirFlights", allAirFlights);

        return "all-flights";
    }
    @RequestMapping("/addNewAirFlight")
    public String addNewAirFlight(Model model) {
        AirFlight airFlight = new AirFlight();
        model.addAttribute("airFlight", airFlight);
        return "flight-info";
    }
    @RequestMapping("/saveAirFlight")
    public String saveAirFlight(@ModelAttribute("airFlight") AirFlight airFlight) {
        airFlightService.saveAirFlight(airFlight);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateAirFlight(@RequestParam("airFlightId") int id, Model model) {
        AirFlight airFlight = airFlightService.getAirFlight(id);
        model.addAttribute("airFlight", airFlight);
        return "flight-info";
    }
    @RequestMapping("/deleteAirFlight")
    public String deleteAirFlight(@RequestParam("airFlightId") int id) {
        airFlightService.deleteAirFlight(id);
        return "redirect:/";
    }
}
