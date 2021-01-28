package com.vishal.flightCheckin.integaration;

import com.vishal.flightCheckin.integaration.dto.Reservation;
import com.vishal.flightCheckin.integaration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
