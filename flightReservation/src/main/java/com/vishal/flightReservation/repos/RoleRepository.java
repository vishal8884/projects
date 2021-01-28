package com.vishal.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.flightReservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
