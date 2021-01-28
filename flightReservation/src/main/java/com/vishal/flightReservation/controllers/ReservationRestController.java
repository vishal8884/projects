package com.vishal.flightReservation.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.flightReservation.dto.ReservationUpdateRequest;
import com.vishal.flightReservation.entities.Reservation;
import com.vishal.flightReservation.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationRestController.class);
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id")
			long id)
	{
		LOGGER.info("inside findReservation() for id :"+id);
		Reservation reservation = reservationRepository.findById(id).orElse(new Reservation());
		return reservation;
	}
	
	@RequestMapping("/reservations") //Request body says at run time this object should be constructed by the content comes by the request
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		LOGGER.info("inside updateReservation() for :"+request);
		Reservation reservation = reservationRepository.findById(request.getId()).orElse(new Reservation());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		Reservation updatedReservation = reservationRepository.save(reservation);
		LOGGER.info("saving reservation");
		return updatedReservation;
	}
	
}
