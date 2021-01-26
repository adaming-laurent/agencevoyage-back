package com.agencevoyage.entities;

public class TrainRide extends Journey{
	
	private Long idTrainRide;
	
	public TrainRide(){}

	public TrainRide(Long idTrainRide) {
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
