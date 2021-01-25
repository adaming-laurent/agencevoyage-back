package com.moperating.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OperatingCompany implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OperatingCompanyId;
	private String OperatingCompanyName;
	private String OperatingCompanyDetails;
	public OperatingCompany() {
		super();
	}
	public OperatingCompany(String operatingCompanyName, String operatingCompanyDetails) {
		super();
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
