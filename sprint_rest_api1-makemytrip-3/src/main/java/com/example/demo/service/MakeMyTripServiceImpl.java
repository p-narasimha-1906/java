package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;
@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
    private String ticket_booking="http://localhost:8080/book";
    private String get_ticket="http://localhost:8080/getData/{k}";
	@Override
	public Ticket ticketBooking(Passenger p) {
		/*RestTemplate rt=new RestTemplate();
	ResponseEntity<Ticket> response=rt.postForEntity(ticket_booking, p, Ticket.class);
		Ticket t=response.getBody();
	
	return t;*/
	WebClient web =	WebClient.create();
	Ticket ticket=web.post()
			.uri(ticket_booking)
			.bodyValue(p)
			.retrieve()
			.bodyToMono(Ticket.class)
			.block();
	return ticket;
	}

	@Override
	public Ticket getTicket(Integer t) {
    /*RestTemplate rt=new RestTemplate();
	ResponseEntity<Ticket> response=rt.getForEntity(get_ticket,Ticket.class,t);
		Ticket m=response.getBody();
	
	return m;*/
	WebClient web =	WebClient.create();
	Ticket ticket=web.get()
			.uri(get_ticket, t)
			.retrieve()
			.bodyToMono(Ticket.class)
			.block();
	return ticket;
	}
	

}
