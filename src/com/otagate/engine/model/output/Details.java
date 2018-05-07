package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Details")
@XmlAccessorType(XmlAccessType.FIELD)
public class Details {
	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "PassengerQuantity")
	private String passengerQuantity;
	@XmlElement(name = "Category")
	private String category;
	@XmlElement(name = "Size")
	private String size;
	@XmlElement(name = "SIPP")
	private String sipp;
	@XmlElement(name = "Transmission")
	private String transmission;
	@XmlElement(name = "Aircondition")
	private String aircondition;
	@XmlElement(name = "Image")
	private Image image;
	

	public Details() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassengerQuantity() {
		return passengerQuantity;
	}

	public void setPassengerQuantity(String passengerQuantity) {
		this.passengerQuantity = passengerQuantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSipp() {
		return sipp;
	}

	public void setSipp(String sipp) {
		this.sipp = sipp;
	}
	
	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getAircondition() {
		return aircondition;
	}

	public void setAircondition(String aircondition) {
		this.aircondition = aircondition;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Details [name=" + name + ", passengerQuantity=" + passengerQuantity + ", category=" + category
				+ ", size=" + size + ", sipp=" + sipp + ", transmission=" + transmission + ", aircondition="
				+ aircondition + ", image=" + image +"]";
	}

}
