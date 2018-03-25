package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueRange implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String getLow() {
		return low;
	}
	public String getHigh() {
		return high;
	}
	@XmlElement(name="low")
	private String low;
	@XmlElement(name="high")
	private String high;
	@Override
	public String toString() {
		return "ValueRange [low=" + low + ", high=" + high + "]";
	}

}
