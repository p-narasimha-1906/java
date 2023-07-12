package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;

@Service
public interface MakeMyTripService {
	public Ticket ticketBooking(Passenger p);
	public Ticket getTicket(Integer t);
	

}
