package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleProperty implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="zestimate")
	private Zestimate zestimate;
	
	@XmlElement(name="rentzestimate")
	private Zestimate rentzestimate;
	
	@XmlElement(name="zpid")
	private int zpid;
	
	@XmlElement(name="address")
	private Address address;
	
	@XmlElement(name="links")
	private Links links;
	
	@XmlElement(name="FIPScounty")
	private String FIPScounty;
	
	@XmlElement(name="useCode")
	private String useCode;
	
	@XmlElement(name="taxAssessmentYear")
	private String taxAssessmentYear;
	
	@XmlElement(name="taxAssessment")
	private String taxAssessment;
	
	@XmlElement(name="yearBuilt")
	private String yearBuilt;
	
	@XmlElement(name="lotSizeSqFt")
	private String lotSizeSqFt;
	
	@XmlElement(name="finishedSwFt")
	private String finishedSwFt;
	
	@XmlElement(name="bathrooms")
	private String bathrooms;
	
	@XmlElement(name="totalRooms")
	private String totalRooms;
	
	@XmlElement(name="lastSoldDate")
	private String lastSoldDate;
	
	@XmlElement(name="lastSoldPrice")
	private String lastSoldPrice;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Zestimate getZestimate() {
		return zestimate;
	}

	public Zestimate getRentzestimate() {
		return rentzestimate;
	}

	public int getZpid() {
		return zpid;
	}

	public Address getAddress() {
		return address;
	}

	public Links getLinks() {
		return links;
	}

	public String getFIPScounty() {
		return FIPScounty;
	}

	public String getUseCode() {
		return useCode;
	}

	public String getTaxAssessmentYear() {
		return taxAssessmentYear;
	}

	public String getTaxAssessment() {
		return taxAssessment;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public String getLotSizeSqFt() {
		return lotSizeSqFt;
	}

	public String getFinishedSwFt() {
		return finishedSwFt;
	}

	public String getBathrooms() {
		return bathrooms;
	}

	public String getTotalRooms() {
		return totalRooms;
	}

	public String getLastSoldDate() {
		return lastSoldDate;
	}

	public String getLastSoldPrice() {
		return lastSoldPrice;
	}
	
}
