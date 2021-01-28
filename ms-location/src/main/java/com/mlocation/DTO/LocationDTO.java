package com.mlocation.DTO;

import com.mlocation.entities.LocationType;

public class LocationDTO {

	private Long idLocation;
	private String locationCode;
	private String locationName;
	private LocationType locationType;
	
	public LocationDTO() {}
	
	public LocationDTO( Long idLocation, String locationCode, String locationName) {
		super();
		this.idLocation = idLocation;
		this.locationCode = locationCode;
		this.locationName = locationName;
	}
	
	
	public LocationDTO(Long idLocation, String locationCode, String locationName, LocationType locationType) {
		this.idLocation = idLocation;
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.locationType = locationType;
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
	
	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	@Override
	public String toString() {
		return "LocationDTO [idLocation=" + idLocation + ", locationCode=" + locationCode + ", locationName="
				+ locationName + ", locationType=" + locationType + "]";
	}
}
