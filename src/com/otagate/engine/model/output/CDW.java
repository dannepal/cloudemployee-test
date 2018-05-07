package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CDW")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDW {
	@XmlAttribute(name = "Excess")
	private String excess;
	@XmlAttribute(name = "Currency")
	private String currency;

	public CDW() {
	}

	public String getExcess() {
		return excess;
	}

	public void setExcess(String excess) {
		this.excess = excess;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "CDW [excess=" + excess + ", currency=" + currency + "]";
	}

}
