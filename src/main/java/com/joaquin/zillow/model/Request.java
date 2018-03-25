package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="zpid")
	private String zpid;

}
