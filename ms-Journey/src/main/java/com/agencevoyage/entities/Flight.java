package com.agencevoyage.entities;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Flight")
public class Flight extends Journey {

	private Long idFlight;
	private String flightNumber;

	public Flight() {
	}

	public Flight(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
			LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, Long idFlight, String flightNumber) {
		super( idJourney, originLocationCode, destinationLocationCode, operatingCompanyid, startDateAndTime, endDateAndTime, otherDetails);
		this.idFlight = idFlight;
		this.flightNumber = flightNumber;
	}
	
	public Flight(Long idFlight, String flightNumber) {
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
