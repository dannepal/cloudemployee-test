package com.otagate.engine.model.output;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company {
	@XmlAttribute(name = "Code")
	private String code;
	@XmlAttribute(name = "Category")
	private String category;
	@XmlElement(name = "Success")
	private String success;
	@XmlElement(name = "PickUpLocation")
	private PickUpLocation pickupLocation;
	@XmlElement(name = "ReturnLocation")
	private ReturnLocation returnLocation;
	@XmlElement(name = "Vehicle")
	private List<Vehicle> vehicles;

	public Company() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public PickUpLocation getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(PickUpLocation pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public ReturnLocation getReturnLocation() {
		return returnLocation;
	}

	public void setReturnLocation(ReturnLocation returnLocation) {
		this.returnLocation = returnLocation;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicle(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Company [code=" + code + ", category=" + category + ", success=" + success + ", pickupLocation="
				+ pickupLocation + ", returnLocation=" + returnLocation + ", vehicles=" + vehicles + "]";
	}

}
