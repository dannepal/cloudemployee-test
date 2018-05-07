package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Calculation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Calculation {
	@XmlAttribute(name = "Quantity")
	private String quantity;
	@XmlAttribute(name = "UnitName")
	private String unitName;

	public Calculation() {
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return "Calculation [quantity=" + quantity + ", unitName=" + unitName + "]";
	}

}
