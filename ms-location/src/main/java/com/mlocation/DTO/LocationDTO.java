package com.mlocation.DTO;

public class LocationDTO {

	private Long idLocation;
	private String locationCode;
	private String locationName;
	
	public LocationDTO() {}
	public LocationDTO( Long idLocation, String locationCode, String locationName) {
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
	
	@Override
	public String toString() {
		return "Location [locationCode=" + locationCode + ", locationName=" + locationName + "]";
	}
}
