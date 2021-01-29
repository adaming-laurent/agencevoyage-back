package com.agencevoyage.entities;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RiverCruise")
public class RiverCruise extends Journey {

	private Long idRiverCruise;
	private String nameOfTheBoat;
	private String portOfRegistration;

	public RiverCruise() {
	}

	public RiverCruise(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
			LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, Long idRiverCruise, String nameOfTheBoat, String portOfRegistration) {
		super( idJourney, originLocationCode, destinationLocationCode, operatingCompanyid, startDateAndTime, endDateAndTime, otherDetails);
		this.idRiverCruise = idRiverCruise;
		this.nameOfTheBoat = nameOfTheBoat;
		this.portOfRegistration = portOfRegistration;
	}

	public Long getIdRiverCruise() {
		return idRiverCruise;
	}

	public void setIdRiverCruise(Long idRiverCruise) {
		this.idRiverCruise = idRiverCruise;
	}

	public String getNameOfTheBoat() {
		return nameOfTheBoat;
	}

	public void setNameOfTheBoat(String nameOfTheBoat) {
		this.nameOfTheBoat = nameOfTheBoat;
	}

	public String getPortOfRegistration() {
		return portOfRegistration;
	}

	public void setPortOfRegistration(String portOfRegistration) {
		this.portOfRegistration = portOfRegistration;
	}

	@Override
	public String toString() {
		return "RiverCruise [idRiverCruise=" + idRiverCruise + ", nameOfTheBoat=" + nameOfTheBoat
				+ ", portOfRegistration=" + portOfRegistration + "]";
	}

}
