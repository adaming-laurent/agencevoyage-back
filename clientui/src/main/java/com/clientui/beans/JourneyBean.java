package com.clientui.beans;

import java.time.LocalDateTime;

public class JourneyBean {

	private Long idJourney;
	private String originLocationCode;
	private String destinationLocationCode;
	private Long operatingCompanyid;
	private LocalDateTime startDateAndTime;
	private LocalDateTime endDateAndTime;
	private String otherDetails;

	private Long CustomerId;

	public JourneyBean() {
	}

	public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode,
			Long operatingCompanyid, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails) {
		this.idJourney = idJourney;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.operatingCompanyid = operatingCompanyid;
		this.startDateAndTime = startDateAndTime;
		this.endDateAndTime = endDateAndTime;
		this.otherDetails = otherDetails;
	}

	public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode,
			Long operatingCompanyid, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails,
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

	public LocalDateTime getStartDateAndTime() {
		return startDateAndTime;
	}

	public void setStartDateAndTime(LocalDateTime startDateAndTime) {
		this.startDateAndTime = startDateAndTime;
	}

	public LocalDateTime getEndDateAndTime() {
		return endDateAndTime;
	}

	public void setEndDateAndTime(LocalDateTime endDateAndTime) {
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
