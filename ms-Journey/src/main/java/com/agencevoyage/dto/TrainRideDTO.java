package com.agencevoyage.dto;

public class TrainRideDTO {

private Long idTrainRide;
	
	public TrainRideDTO(){}

	public TrainRideDTO(Long idTrainRide) {
		super();
		this.idTrainRide = idTrainRide;
	}

	public Long getIdTrainRide() {
		return idTrainRide;
	}

	public void setIdTrainRide(Long idTrainRide) {
		this.idTrainRide = idTrainRide;
	}
}
