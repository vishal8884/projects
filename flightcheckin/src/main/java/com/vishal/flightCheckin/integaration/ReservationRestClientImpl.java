package com.vishal.flightCheckin.integaration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.vishal.flightCheckin.integaration.dto.Reservation;
import com.vishal.flightCheckin.integaration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	@Value("${com.vishal.flightCheckin.reservationRestUrl}")
	private String RESERVATION_REST_URL;

	@Override
	public Reservation findReservation(Long id)
	{
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL+id,Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request,Reservation.class);
		return reservation;
	}

}
