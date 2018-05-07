package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Image")
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {
	
	@XmlValue
	private String imageValue;

	public Image() {
	}

	public String getImageValue() {
		return imageValue;
	}

	public void setImageValue(String imageValue) {
		this.imageValue = imageValue;
	}

	@Override
	public String toString() {
		return "Image [imageValue=" + imageValue + "]";
	}
	
}
