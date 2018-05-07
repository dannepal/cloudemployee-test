package com.otagate.engine.model.output;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Fees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fees {
	@XmlElement(name = "Fee")
	private List<Fee> fees;

	public Fees() {
	}

	public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Fees [fees=" + fees + "]";
	}
	
}
