package com.parthu.service;

import com.parthu.request.Passenger;
import com.parthu.response.Ticket;

public interface MakeMyTripService {
 public Ticket getBookTicket(Passenger passenger);
 public Ticket getTicket(Integer ticketNumber);
}
