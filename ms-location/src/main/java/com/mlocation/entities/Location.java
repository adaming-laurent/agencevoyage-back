package com.mlocation.entities;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocation;
	private String locationCode;
	private String locationName;
	private LocationType locationType;
	
//	@OneToMany(mappedBy = "location")
//	private List<Journey> journey=new ArrayList<>();
	
	
	public Location() {}
	public Location( Long idLocation, String locationCode, String locationName) {
		super();
		this.idLocation = idLocation;
		this.locationCode = locationCode;
		this.locationName = locationName;
	}

	public Long getIdLocation() {
		return idLocation;
	}
	public void setIdLocation(Long idLocation) {
		this.idLocation = idLocation;
	}
	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
//	public List<Journey> getJourney() {
//		return journey;
//	}
//	public void setJourney(List<Journey> journey) {
//		this.journey = journey;
//}
	
	public LocationType getLocationType() {
		return locationType;
	}
	
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
	public Location(String locationCode, String locationName, LocationType locationType) {
		super();
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.locationType = locationType;
	}

}
