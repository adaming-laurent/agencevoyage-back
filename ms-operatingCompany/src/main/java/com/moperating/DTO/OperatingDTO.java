package com.moperating.DTO;

public class OperatingDTO {

	private Long operatingCompanyId;
	private String operatingCompanyName;
	private String operatingCompanyDetails;
	
	public OperatingDTO() {
		super();
	}
	
	public OperatingDTO(String operatingCompanyName, String operatingCompanyDetails) {
		super();
		this.operatingCompanyName = operatingCompanyName;
		this.operatingCompanyDetails = operatingCompanyDetails;
	}
	
	public Long getOperatingCompanyId() {
		return operatingCompanyId;
	}
	public void setOperatingCompanyId(Long operatingCompanyId) {
		this.operatingCompanyId = operatingCompanyId;
	}
	public String getOperatingCompanyName() {
		return operatingCompanyName;
	}
	public void setOperatingCompanyName(String operatingCompanyName) {
		this.operatingCompanyName = operatingCompanyName;
	}
	public String getOperatingCompanyDetails() {
		return operatingCompanyDetails;
	}
	public void setOperatingCompanyDetails(String operatingCompanyDetails) {
		this.operatingCompanyDetails = operatingCompanyDetails;
	}
	@Override
	public String toString() {
		return "OperatingCompany [OperatingCompanyId=" + operatingCompanyId + ", OperatingCompanyName="
				+ operatingCompanyName + ", OperatingCompanyDetails=" + operatingCompanyDetails + "]";
	}
}
