package com.agencevoyage.beans;

public class FlightBean {

	private Long idFlight;
	private String flightNumber;

	public FlightBean() {}
	public FlightBean(Long idFlight, String flightNumber) {
		super();
		this.idFlight = idFlight;
		this.flightNumber = flightNumber;
	}
	
	public Long getIdFlight() {
		return idFlight;
	}
	public void setIdFlight(Long idFlight) {
		this.idFlight = idFlight;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
}
