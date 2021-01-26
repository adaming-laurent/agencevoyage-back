package com.agencevoyage.entities;

public class RiverCruise extends Journey{
	
	private static final long serialVersionUID = 1L;
	private Long idRiverCruise;
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruise() {}
	
	public RiverCruise(Long idRiverCruise, String nameOfTheBoat, String portOfRegistration) {
		super();
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
