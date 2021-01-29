package com.agencevoyage.dto;

import java.time.LocalDateTime;

public class FlightDTO extends JourneyDTO{

	private Long idFlight;
	private String flightNumber;

	public FlightDTO() {}
	public FlightDTO(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
			LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, Long idFlight, String flightNumber) {
		super( idJourney, originLocationCode, destinationLocationCode, operatingCompanyid, startDateAndTime, endDateAndTime, otherDetails);
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
