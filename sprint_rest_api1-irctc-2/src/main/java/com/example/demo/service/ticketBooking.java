package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;
@Service
public interface ticketBooking {
	public Ticket bookTicket(Passenger p);
	public Ticket getData(Integer k);
	

}
