package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="homedetails")
	private String homedetails;
	
	@XmlElement(name="graphsanddata")
	private String graphsanddata;
	
	@XmlElement(name="mapthishome")
	private String mapthishome;
	
	@XmlElement(name="myestimator")
	private String myestimator;
	
	@XmlElement(name="comparables")
	private String comparables;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getHomedetails() {
		return homedetails;
	}

	public String getGraphsanddata() {
		return graphsanddata;
	}

	public String getMapthishome() {
		return mapthishome;
	}

	public String getMyestimator() {
		return myestimator;
	}

	public String getComparables() {
		return comparables;
	}
	
}
