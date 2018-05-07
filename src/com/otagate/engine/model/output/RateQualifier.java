package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RateQualifier")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateQualifier {
	
	@XmlAttribute(name = "RateCategory")
	private String rateCategory;
	@XmlValue
	private String rateQualifier;

	public RateQualifier() {
	}

	public String getRateCategory() {
		return rateCategory;
	}

	public void setRateCategory(String rateCategory) {
		this.rateCategory = rateCategory;
	}

	
	public String getRateQualifier() {
		return rateQualifier;
	}

	public void setRateQualifier(String rateQualifier) {
		this.rateQualifier = rateQualifier;
	}

	@Override
	public String toString() {
		return "RateQualifier [rateCategory=" + rateCategory + ", rateQualifier=" + rateQualifier + "]";
	}

	
}
