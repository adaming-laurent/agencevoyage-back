package com.agencevoyage.entities;

public class TrainRide extends Journey{
	
	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "TrainRide [idTrainRide=" + idTrainRide + "]";
	}
	
}
