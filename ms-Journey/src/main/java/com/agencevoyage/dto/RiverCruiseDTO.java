package com.agencevoyage.dto;

import java.time.LocalDateTime;

public class RiverCruiseDTO extends JourneyDTO{

	private Long idRiverCruise;
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruiseDTO() {}
	
	public RiverCruiseDTO(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
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

}
