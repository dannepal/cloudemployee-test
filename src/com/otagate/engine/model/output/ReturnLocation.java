package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ReturnLocation")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReturnLocation {
	@XmlAttribute(name = "Code")
	private String code;

	public ReturnLocation() {
	}

	public ReturnLocation(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ReturnLocation [code=" + code + "]";
	}

}
