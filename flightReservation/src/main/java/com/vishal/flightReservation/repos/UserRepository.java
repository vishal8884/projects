package com.vishal.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);

}
