package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="street")
	private String street;
	
	@XmlElement(name="zipcode")
	private String zipcode;
	
	@XmlElement(name="city")
	private String city;
	
	@XmlElement(name="state")
	private String state;
	
	@XmlElement(name="latitude")
	private String latitude;
	
	@XmlElement(name="longitude")
	private String longitude;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStreet() {
		return street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}
	
}
