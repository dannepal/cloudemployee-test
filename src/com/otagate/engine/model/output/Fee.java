package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Fee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fee {
	@XmlAttribute(name = "Purpose")
	private String purpose;
	@XmlAttribute(name = "Description")
	private String description;
	@XmlAttribute(name = "CurrencyCode")
	private String currencyCode;
	@XmlAttribute(name = "Amount")
	private String amount;
	@XmlElement(name = "Calculation")
	private Calculation calculation;

	public Fee() {
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Calculation getCalculation() {
		return calculation;
	}

	public void setCalculation(Calculation calculation) {
		this.calculation = calculation;
	}

	@Override
	public String toString() {
		return "Fee [purpose=" + purpose + ", description=" + description + ", currencyCode=" + currencyCode
				+ ", amount=" + amount + ", calculation=" + calculation + "]";
	}

}
