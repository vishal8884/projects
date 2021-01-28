package com.vishal.flightReservation.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vishal.flightReservation.dto.ReservationRequest;
import com.vishal.flightReservation.entities.Flight;
import com.vishal.flightReservation.entities.Reservation;
import com.vishal.flightReservation.repos.FlightRepository;
import com.vishal.flightReservation.services.ReservationService;

@Controller
public class ReservatonController {
	
	@Autowired
	FlightRepository flightRepository;

	@Autowired
	ReservationService reservationService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservatonController.class);
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId , ModelMap modelMap)
	{
		
		LOGGER.info("inside showCompleteReservation() invoked with flight id"+flightId);
		Flight other=new Flight();
		Flight flight = flightRepository.findById(flightId).orElse(other);
		modelMap.addAttribute("flight",flight);
		LOGGER.info("flight is "+flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation",method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap)
	{
		LOGGER.info("inside completeReservation"+request);
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg","Reservation created sucesfully and the id is "+reservation.getId());
		return "reservationConfirmation";
	}
}
