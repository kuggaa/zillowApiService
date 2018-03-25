package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement(name="zestimate", namespace="http://www.zillow.com/static/xsd/Zestimate.xsd")
@XmlType(name="zestimate", namespace="http://www.zillow.com/static/xsd/Zestimate.xsd")
@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZillowResponse implements Serializable{

	/*@XmlElement(name="request")
	private Request request;
	
	@XmlElement(name="message")
	private Message message;*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="response")
	private DetailedProperty detailedProperty;

	
	public DetailedProperty getDetailedProperty() {
		return detailedProperty;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override		
	public String toString() {
		return detailedProperty.toString();
	}
}