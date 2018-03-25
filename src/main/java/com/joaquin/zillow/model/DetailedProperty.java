package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedProperty implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="zestimate")
	private Zestimate zestimate;

	public Zestimate getZestimate() {
		return zestimate;
	}

	@Override
	public String toString() {
		return zestimate.toString();
	}
}
