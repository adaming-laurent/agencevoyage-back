package com.moperating.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operating implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operatingCompanyId;
	private String operatingCompanyName;
	private String operatingCompanyDetails;
	
	public Operating() {
		super();
	}
	
	public Operating(String operatingCompanyName, String operatingCompanyDetails) {
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
