package com.agencevoyage.dto;

public class FlightDTO {

	private Long idFlight;
	private String flightNumber;

	public FlightDTO() {}
	public FlightDTO(Long idFlight, String flightNumber) {
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
