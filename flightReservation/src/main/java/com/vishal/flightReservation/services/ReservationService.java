package com.vishal.flightReservation.services;

import com.vishal.flightReservation.dto.ReservationRequest;
import com.vishal.flightReservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
