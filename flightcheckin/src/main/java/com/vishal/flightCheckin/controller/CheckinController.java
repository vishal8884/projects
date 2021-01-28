package com.vishal.flightCheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vishal.flightCheckin.integaration.ReservationRestClient;
import com.vishal.flightCheckin.integaration.dto.Reservation;
import com.vishal.flightCheckin.integaration.dto.ReservationUpdateRequest;

@Controller
public class CheckinController {

	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckin()
	{
		return "startCheckin";
	}
	
	@RequestMapping("/startCheckin")
	public String startCheckIn(@RequestParam("reservationId") long reservationId, ModelMap modelMap)
	{
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",reservation);
		
		return "displayReservationDetails";
	}
	
	@RequestMapping("/completeCheckin")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags)
	{
		ReservationUpdateRequest reservationUpdaterequest = new ReservationUpdateRequest();
		reservationUpdaterequest.setId(reservationId);
		reservationUpdaterequest.setCheckedIn(true);
		reservationUpdaterequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdaterequest);
		return "checkInConfirmation";
	}
}
