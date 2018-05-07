package com.otagate.engine.model.output;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Companies")
@XmlAccessorType(XmlAccessType.FIELD)
public class Companies {
	@XmlElement(name = "Company")
	private List<Company> companies;
	@XmlAttribute(name = "FromDate")
	private String fromDate;
	@XmlAttribute(name = "ToDate")
	private String toDate;
	@XmlAttribute(name = "CountryOfOrigin")
	private String countryOfOrigin;
	
	public Companies() {
	}

	public Companies(List<Company> companies, String fromDate, String toDate, String countryOfOrigin) {
		this.companies = companies;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.countryOfOrigin = countryOfOrigin;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return "Companies [companies=" + companies + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", countryOfOrigin=" + countryOfOrigin + "]";
	}
	
}
