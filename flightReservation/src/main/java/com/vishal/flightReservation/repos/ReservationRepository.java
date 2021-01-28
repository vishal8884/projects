package com.vishal.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.flightReservation.entities.Passenger;
import com.vishal.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
