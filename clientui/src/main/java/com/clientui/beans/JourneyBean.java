package com.agencevoyage.beans;

public class JourneyBean {

	private Long idJourney;
	private String originLocationCode;
	private String destinationLocationCode;
	private String operatingCompanyid;
	private String startDateAndTime;
	private String endDateAndTime;
	private String otherDetails;
	
	
	public JourneyBean() {}
	
	public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode,
			String operatingCompanyid, String startDateAndTime, String endDateAndTime, String otherDetails) {
		this.idJourney = idJourney;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.operatingCompanyid = operatingCompanyid;
		this.startDateAndTime = startDateAndTime;
		this.endDateAndTime = endDateAndTime;
		this.otherDetails = otherDetails;
	}

	public Long getJourneyId() {
		return idJourney;
	}

	public void setJourneyId(Long idJourney) {
		this.idJourney = idJourney;
	}

	public String getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public String getOperatingCompanyid() {
		return operatingCompanyid;
	}

	public void setOperatingCompanyid(String operatingCompanyid) {
		this.operatingCompanyid = operatingCompanyid;
	}

	public String getStartDateAndTime() {
		return startDateAndTime;
	}

	public void setStartDateAndTime(String startDateAndTime) {
		this.startDateAndTime = startDateAndTime;
	}

	public String getEndDateAndTime() {
		return endDateAndTime;
	}

	public void setEndDateAndTime(String endDateAndTime) {
		this.endDateAndTime = endDateAndTime;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
}
