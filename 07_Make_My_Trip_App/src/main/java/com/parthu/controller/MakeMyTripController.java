package com.parthu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.parthu.request.Passenger;
import com.parthu.response.Ticket;
import com.parthu.service.MakeMyTripService;

@Controller
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService service;

	@GetMapping("/")
	public String loadBookPage(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "book";
	}

	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger, Model model) {
		Ticket bookTicket = service.getBookTicket(passenger);
		model.addAttribute("msg", "your ticket is successfully booked with id: " + bookTicket.getTicketNum());
		return "book";
	}

	@GetMapping("/ticket")
	public String getTicketPage(Model model) {
		model.addAttribute("ticket",new Ticket());
		return "ticket";
	}
	
	@PostMapping("/ticket")
	public String getTicket(@RequestParam Integer ticketNum, Model model) {
		Ticket ticket = service.getTicket(ticketNum);
		model.addAttribute(" ticket",ticket);
		return "ticket";
	}
}
