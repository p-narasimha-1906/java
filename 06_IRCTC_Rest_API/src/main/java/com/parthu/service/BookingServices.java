package com.parthu.service;

import com.parthu.request.Passenger;
import com.parthu.response.Ticket;

public interface BookingServices {
	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer trainNumber);

}
