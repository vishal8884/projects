package com.vishal.flightReservation.services;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vishal.flightReservation.controllers.ReservatonController;
import com.vishal.flightReservation.dto.ReservationRequest;
import com.vishal.flightReservation.entities.Flight;
import com.vishal.flightReservation.entities.Passenger;
import com.vishal.flightReservation.entities.Reservation;
import com.vishal.flightReservation.repos.FlightRepository;
import com.vishal.flightReservation.repos.PassengerRepository;
import com.vishal.flightReservation.repos.ReservationRepository;
import com.vishal.flightReservation.util.EmailUtil;
import com.vishal.flightReservation.util.PDFGenerator;

@Service
public class ReservationServiceIMPL implements ReservationService {

	@Value("${com.vishal.flightreservation.itinerary.dirpath}")
	private String ITINERARY_DIR;
//	private String ITINERARY_DIR = "C:\\Users\\visha\\Desktop\\New folder\\ReservationPdf/reservation";
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailutil;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceIMPL.class);
	
	
	@Override
	@Transactional//if exception happens in any step mail wont be sent
	public Reservation bookFlight(ReservationRequest request) {
		
		//Make payment
		LOGGER.info("inside bookFlight()");
		
		Long flightId = request.getFlightId();
		LOGGER.info("fetching flight id"+flightId);
		
		Flight flight=flightRepository.findById(flightId).orElse(new Flight());
		
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		LOGGER.info("saving the passenger:"+passenger);
		
		
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		LOGGER.info("saving the reservation "+reservation);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		String filePath=ITINERARY_DIR+savedReservation.getId()+".pdf";
		LOGGER.info("gETTING THE ITENARY");
		pdfGenerator.generateItenary(savedReservation,filePath);
		
		
		LOGGER.info("Emailing the itenary");
		emailutil.sendItenerary(passenger.getEmail(), filePath);
		return savedReservation;
	}

}
