package com.clientui.beans;

import java.time.LocalDateTime;

public class TrainRideBean extends JourneyBean{

	private Long idTrainRide;
	
	public TrainRideBean(){}

	public TrainRideBean(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
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
	
	@Override
	public String toString() {
		return "TrainRide [idTrainRide=" + idTrainRide + "]";
	}
	
}
