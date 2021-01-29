package com.agencevoyage.entities;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TrainRide")
public class TrainRide extends Journey{
	
	private Long idTrainRide;
	
	public TrainRide(){}

	public TrainRide(Long idJourney,String originLocationCode, String destinationLocationCode, Long operatingCompanyid,
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
