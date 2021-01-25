package com.clientui.beans;

public class OperatingCompanyBean {
	
	private Long OperatingCompanyId;
	private String OperatingCompanyName;
	private String OperatingCompanyDetails;
	
	public OperatingCompanyBean() {
	}
	public OperatingCompanyBean(String operatingCompanyName, String operatingCompanyDetails) {
		OperatingCompanyName = operatingCompanyName;
		OperatingCompanyDetails = operatingCompanyDetails;
	}
	public Long getOperatingCompanyId() {
		return OperatingCompanyId;
	}
	public void setOperatingCompanyId(Long operatingCompanyId) {
		OperatingCompanyId = operatingCompanyId;
	}
	public String getOperatingCompanyName() {
		return OperatingCompanyName;
	}
	public void setOperatingCompanyName(String operatingCompanyName) {
		OperatingCompanyName = operatingCompanyName;
	}
	public String getOperatingCompanyDetails() {
		return OperatingCompanyDetails;
	}
	public void setOperatingCompanyDetails(String operatingCompanyDetails) {
		OperatingCompanyDetails = operatingCompanyDetails;
	}
	@Override
	public String toString() {
		return "OperatingCompany [OperatingCompanyId=" + OperatingCompanyId + ", OperatingCompanyName="
				+ OperatingCompanyName + ", OperatingCompanyDetails=" + OperatingCompanyDetails + "]";
	}
	
}
