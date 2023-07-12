package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;
import com.example.demo.service.MakeMyTripService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
@Controller
public class MtmController {
	@Autowired
	private MakeMyTripService service;
	
	@GetMapping("/")
	public String getForm(Model mode)
	{
		mode.addAttribute("Passenger",new Passenger());
		return "ticketbooking";
	}
	@GetMapping("/viewForm")
	public String viewForm(Model mode)
	{
		mode.addAttribute("ticket",new Ticket());
		return "viewform";
	}
    @PostMapping("/book-ticket")
	public String ticketBooking(@ModelAttribute("Passenger") Passenger p,Model mode)
	{
		System.out.println(p);
		Ticket t=service.ticketBooking(p);
		mode.addAttribute("msg","ticket booked with id"+t.getTicketNum());
		
		return "ticketbooking";
	}
    
    @GetMapping("/getTicket")
	public String ticketBooking(@RequestParam Integer ticketNum,Model mode)
	{
		
		Ticket m=service.getTicket(ticketNum);
		
		mode.addAttribute("ticket",m);
		return "viewform";
	}
}
