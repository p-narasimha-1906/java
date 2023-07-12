package com.example.demo.Restcontroller;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;
import com.example.demo.service.ticketBooking;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private ticketBooking t;
	
@PostMapping(value="/book",
              consumes = "application/json",
              produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p)
	{
	Ticket m=t.bookTicket(p);
		
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
@GetMapping(value="/getData/{k}",
produces = "application/json")
 public Ticket getData(@PathVariable Integer k)
 {
	Ticket m=t.getData(k);
	 return m;
 }

}
