package com.mlocation.entities;

public enum LocationType {
	Airport, Seaport, TrainStation;
	
	public String getOptionText() {
		switch(this) {
		case Airport:
			return "airport";
		case Seaport:
			return "seaport";
		case TrainStation:
			return "trainstation";
		default:
			return null;
		}
		
	}
}
