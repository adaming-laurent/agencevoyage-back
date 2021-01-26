package com.agencevoyage.entities;

import javax.persistence.Entity;

@Entity
public class Flight extends Journey {
	
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

	

}
