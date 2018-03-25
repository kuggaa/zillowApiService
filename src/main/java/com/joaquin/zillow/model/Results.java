package com.joaquin.zillow.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="result")
	private List<SimpleProperty> simpleProperty;

	public List<SimpleProperty> getSimpleProperty() {
		return simpleProperty;
	}
}
