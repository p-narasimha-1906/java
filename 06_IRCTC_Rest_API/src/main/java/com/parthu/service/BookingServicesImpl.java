package com.parthu.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.parthu.request.Passenger;
import com.parthu.response.Ticket;

@Service
public class BookingServicesImpl implements BookingServices {

	private Map<Integer, Ticket> dataMap = new HashMap<>();
	private Integer ticketNumber = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		// Logic

		Ticket t = new Ticket();

		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(420.0);
		t.setStatus("Confirmed");
		t.setTicketNumber(ticketNumber);
		dataMap.put(ticketNumber, t);
		ticketNumber++;
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(dataMap.containsKey(ticketNumber)) {
			
			return dataMap.get(ticketNumber); 
		}
		return null;
	}

}
