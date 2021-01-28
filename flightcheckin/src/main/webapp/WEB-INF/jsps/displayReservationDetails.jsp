<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>

Airlines : ${reservation.flight.operatingAirlines} <br>
flight Number : ${reservation.flight.flightNumber} <br>
departure City : ${reservation.flight.departureCity}<br>
arrival City : ${reservation.flight.arrivalCity}<br>
date Of Departure : ${reservation.flight.dateOfDeparture}<br>
estimated DepartureTime : ${reservation.flight.estimatedDepartureTime}<br>


<h2>Passenger details</h2>

First Name : ${reservation.passenger.firstName}<br>
last Name : ${reservation.passenger.lastName}<br>
phone : ${reservation.passenger.phone}<br>
email : ${reservation.passenger.email}<br>

<form action="completeCheckin" method="post">

Enter the number of bags you want to check: <input type="text" name="numberOfBags"/>

<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check In"/>

</form>


</body>
</html>