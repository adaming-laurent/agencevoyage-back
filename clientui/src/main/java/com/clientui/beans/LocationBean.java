package com.clientui.beans;

public class LocationBean {
	
	private Long idLocation;
	private String locationCode;
	private String locationName;
	private LocationType locationType;
	
	
	public LocationBean() {}
	
	public LocationBean(String locationCode, String locationName, LocationType locationType) {
		super();
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
		return "Location [idLocation=" + idLocation + ", locationCode=" + locationCode + ", locationName="
				+ locationName + ", locationType=" + locationType + "]";
	}

}
