package com.agencevoyage.dto;

import java.time.LocalDateTime;

public class TrainRideDTO extends JourneyDTO{

private Long idTrainRide;
	
	public TrainRideDTO(){}

	public TrainRideDTO(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
			LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, Long idTrainRide) {
		super( idJourney, originLocationCode, destinationLocationCode, operatingCompanyid, startDateAndTime, endDateAndTime, otherDetails);
		this.idTrainRide = idTrainRide;
	}

	public Long getIdTrainRide() {
		return idTrainRide;
	}

	public void setIdTrainRide(Long idTrainRide) {
		this.idTrainRide = idTrainRide;
	}
}
