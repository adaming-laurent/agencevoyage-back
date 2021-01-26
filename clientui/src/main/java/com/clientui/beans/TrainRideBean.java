package com.clientui.beans;

public class TrainRideBean {

	private Long idTrainRide;
	
	public TrainRideBean(){}

	public TrainRideBean(Long idTrainRide) {
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
