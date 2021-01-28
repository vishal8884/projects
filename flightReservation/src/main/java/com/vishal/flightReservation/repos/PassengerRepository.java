package com.vishal.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
