
package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {
	@XmlAttribute(name = "Status")
	private String status;
	@XmlAttribute(name = "DynamicExtras")
	private String dynamicExtras;
	@XmlAttribute(name = "MustRecalculateExtras")
	private String mustRecalculateExtras;
	@XmlElement(name = "Details")
	private Details details;
	@XmlElement(name = "Fees")
	private Fees fees;
	@XmlElement(name = "Total")
	private Total total;
	@XmlElement(name = "CDW")
	private CDW cdw;
	@XmlElement(name = "RateDistance")
	private RateDistance rateDistance;
	@XmlElement(name = "RateQualifier")
	private RateQualifier rateQualifier;

	public Vehicle() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDynamicExtras() {
		return dynamicExtras;
	}

	public void setDynamicExtras(String dynamicExtras) {
		this.dynamicExtras = dynamicExtras;
	}

	public String getMustRecalculateExtras() {
		return mustRecalculateExtras;
	}

	public void setMustRecalculateExtras(String mustRecalculateExtras) {
		this.mustRecalculateExtras = mustRecalculateExtras;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public CDW getCdw() {
		return cdw;
	}

	public void setCdw(CDW cdw) {
		this.cdw = cdw;
	}

	public RateDistance getRateDistance() {
		return rateDistance;
	}

	public void setRateDistance(RateDistance rateDistance) {
		this.rateDistance = rateDistance;
	}

	public RateQualifier getRateQualifier() {
		return rateQualifier;
	}

	public void setRateQualifier(RateQualifier rateQualifier) {
		this.rateQualifier = rateQualifier;
	}

	@Override
	public String toString() {
		return "Vehicle [status=" + status + ", dynamicExtras=" + dynamicExtras + ", mustRecalculateExtras="
				+ mustRecalculateExtras + ", details=" + details + ", fees=" + fees + ", total=" + total + ", cdw="
				+ cdw + ", rateDistance=" + rateDistance + ", rateQualifier=" + rateQualifier + "]";
	}

}
