package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {
	@XmlAttribute(name = "CurrencyCode")
	private String currencyCode;
	@XmlAttribute(name = "EstimatedTotalAmount")
	private String estimatedTotalAmount;
	@XmlAttribute(name = "RateTotalAmount")
	private String rateTotalAmount;

	public Total() {
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getEstimatedTotalAmount() {
		return estimatedTotalAmount;
	}

	public void setEstimatedTotalAmount(String estimatedTotalAmount) {
		this.estimatedTotalAmount = estimatedTotalAmount;
	}

	public String getRateTotalAmount() {
		return rateTotalAmount;
	}

	public void setRateTotalAmount(String rateTotalAmount) {
		this.rateTotalAmount = rateTotalAmount;
	}

	@Override
	public String toString() {
		return "Total [currencyCode=" + currencyCode + ", estimatedTotalAmount=" + estimatedTotalAmount
				+ ", rateTotalAmount=" + rateTotalAmount + "]";
	}

}
