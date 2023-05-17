package com.parthu.response;

public class Ticket {
	
	private String name;
	private String from;
	private String to;
	private String doj;
	private Integer ticketNumber;
	private String status;
	private Double ticketCost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", from=" + from + ", to=" + to + ", doj=" + doj + ", ticketNumber="
				+ ticketNumber + ", status=" + status + ", ticketCost=" + ticketCost + "]";
	}
	
	
	
	
	
	

}
