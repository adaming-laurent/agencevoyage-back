package com.clientui.beans;

import java.time.LocalDateTime;

public class RiverCruiseBean extends JourneyBean{

	private Long idRiverCruise;
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruiseBean() {}
	
	public RiverCruiseBean(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
			LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, Long idRiverCruise, String nameOfTheBoat, String portOfRegistration) {
		super( idJourney, originLocationCode, destinationLocationCode, operatingCompanyid, startDateAndTime, endDateAndTime, otherDetails);
		this.idRiverCruise = idRiverCruise ;
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
