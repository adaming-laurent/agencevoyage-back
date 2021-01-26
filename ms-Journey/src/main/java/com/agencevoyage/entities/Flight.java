package com.agencevoyage.entities;

import javax.persistence.Entity;

@Entity
public class Flight extends Journey {
	
	private static final long serialVersionUID = 1L;
	
	private Long idFlight;
	private String flightNumber;

	public Flight() {}
	public Flight(Long idFlight, String flightNumber) {
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
	
	@Override
	public String toString() {
		return "Flight [idFlight=" + idFlight + ", flightNumber=" + flightNumber + "]";
	}

}
