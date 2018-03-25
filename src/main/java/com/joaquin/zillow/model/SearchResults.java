package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement(name="searchresults", namespace="http://www.zillow.com/static/xsd/SearchResults.xsd")
@XmlType(name="searchresults", namespace="http://www.zillow.com/static/xsd/SearchResults.xsd")
@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResults implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*@XmlElement(name="request")
	private Request request;
	
	@XmlElement(name="message")
	private Message message;*/
	
	@XmlElement(name="response")
	private Response response;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Response getResponse() {
		return response;
	}

}
