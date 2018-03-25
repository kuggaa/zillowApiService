package com.joaquin.zillow.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@XmlAccessorType(XmlAccessType.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Zestimate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="amount")
	private String amount;
	
	@XmlElement(name="oneWeekChange")
	private String amountOptional;
	
	@XmlElement(name="valueChange")
	private String valueChange;
	
	@XmlElement(name="valuationRange")
	private ValueRange valueRange;
	
	@XmlElement(name="last-updated")
	private String lastUpdated;
	
	@XmlElement(name="percentile")
	private String percentile;

	@Override
	public String toString() {
		return "Zestimate [amount=" + amount + ", amountOptional=" + amountOptional + ", valueChange=" + valueChange
				+ ", valueRange=" + valueRange + ", lastUpdated=" + lastUpdated + ", percentile=" + percentile + "]";
	}

	public String getAmount() {
		return amount;
	}

	public String getAmountOptional() {
		return amountOptional;
	}

	public String getValueChange() {
		return valueChange;
	}

	public ValueRange getValueRange() {
		return valueRange;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public String getPercentile() {
		return percentile;
	}

	
}
