package com.parthu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parthu.request.Passenger;
import com.parthu.response.Ticket;
import com.parthu.service.BookingServices;

@RestController
public class BookingRestContoller {

	@Autowired
	private BookingServices service;

	@PostMapping(value = "/ticket",
			consumes = { "application/json" }, 
			produces = { "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		
		System.out.println(passenger);
		
		Ticket ticket = service.bookTicket(passenger);
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/ticket/{ticketNumber}", 
			produces = { "application/json" })
	public Ticket getTicket(@PathVariable Integer ticketNumber) {
		return service.getTicket(ticketNumber);
	}

}
