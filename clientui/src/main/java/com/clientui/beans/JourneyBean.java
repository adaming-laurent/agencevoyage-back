package com.clientui.beans;

public class JourneyBean {

	private Long idJourney;
	private String originLocationCode;
	private String destinationLocationCode;
	private Long operatingCompanyid;
	private String startDateAndTime;
	private String endDateAndTime;
	private String otherDetails;

	private Long CustomerId;

	public JourneyBean() {
	}

	public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode,
			Long operatingCompanyid, String startDateAndTime, String endDateAndTime, String otherDetails) {
		this.idJourney = idJourney;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.operatingCompanyid = operatingCompanyid;
		this.startDateAndTime = startDateAndTime;
		this.endDateAndTime = endDateAndTime;
		this.otherDetails = otherDetails;
	}

	public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode,
			Long operatingCompanyid, String startDateAndTime, String endDateAndTime, String otherDetails,
			Long customerId) {
		this.idJourney = idJourney;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.operatingCompanyid = operatingCompanyid;
		this.startDateAndTime = startDateAndTime;
		this.endDateAndTime = endDateAndTime;
		this.otherDetails = otherDetails;
		this.CustomerId = customerId;
	}

	public Long getIdJourney() {
		return idJourney;
	}

	public void setIdJourney(Long idJourney) {
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

	public Long getOperatingCompanyid() {
		return operatingCompanyid;
	}

	public void setOperatingCompanyid(Long operatingCompanyid) {
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

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}

	@Override
	public String toString() {
		return "JourneyBean [idJourney=" + idJourney + ", originLocationCode=" + originLocationCode
				+ ", destinationLocationCode=" + destinationLocationCode + ", operatingCompanyid=" + operatingCompanyid
				+ ", startDateAndTime=" + startDateAndTime + ", endDateAndTime=" + endDateAndTime + ", otherDetails="
				+ otherDetails + ", CustomerId=" + CustomerId + "]";
	}

}
