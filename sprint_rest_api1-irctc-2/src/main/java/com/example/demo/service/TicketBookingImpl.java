package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Passenger;
import com.example.demo.binding.Ticket;
@Service
public class TicketBookingImpl  implements ticketBooking{
	private Integer n=1;
	private Map<Integer, Ticket> m=new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket t=new Ticket();
		BeanUtils.copyProperties(p, t);
		t.setTicketNum(n);
		t.setStatus("booked");
		t.setCost("500");
		m.put(n, t);
		n++;
		
		
		return t;
	}

	@Override
	public Ticket getData(Integer k) {
		// TODO Auto-generated method stub
		return m.get(k);
	}
	

}
