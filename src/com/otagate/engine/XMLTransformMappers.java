package com.otagate.engine;

import java.util.ArrayList;

import javax.xml.stream.XMLStreamReader;

import com.otagate.engine.model.output.PickUpLocation;
import com.otagate.engine.model.output.RateDistance;
import com.otagate.engine.model.output.RateQualifier;
import com.otagate.engine.model.output.ReturnLocation;
import com.otagate.engine.model.output.Total;
import com.otagate.engine.model.output.Vehicle;
import com.otagate.engine.model.output.CDW;
import com.otagate.engine.model.output.Calculation;
import com.otagate.engine.model.output.Companies;
import com.otagate.engine.model.output.Company;
import com.otagate.engine.model.output.Coverage;
import com.otagate.engine.model.output.Details;
import com.otagate.engine.model.output.Fee;

public class XMLTransformMappers {

	public static Companies companies(XMLStreamReader reader, Companies companies) {
		if (companies == null) {
			companies = new Companies();
			companies.setCompanies(new ArrayList<Company>());
		}
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "PickUpDateTime":
					companies.setFromDate(reader.getAttributeValue(i));
					break;
				case "ReturnDateTime":
					companies.setToDate(reader.getAttributeValue(i));
					break;
				case "Code":
					companies.setCountryOfOrigin(reader.getAttributeValue(i));
					break;
			}
			i++;
		}
		return companies;
	}

	public static Company company(XMLStreamReader reader, String elem, Company company) {
		if (company == null)
			company = new Company();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "LocationCode":
					if("ReturnLocation".equalsIgnoreCase(elem)) {
						ReturnLocation loc1 = new ReturnLocation();
						loc1.setCode(reader.getAttributeValue(i));
						company.setReturnLocation(loc1);
					} else {
						PickUpLocation loc2 = new PickUpLocation();
						loc2.setCode(reader.getAttributeValue(i));
						company.setPickupLocation(loc2);
					}
					break;
			}
			i++;
		}
		return company;
	}

	public static Vehicle vehicle(XMLStreamReader reader, Vehicle vehicle) {
		if (vehicle == null)
			vehicle = new Vehicle();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "Status":
					vehicle.setStatus(reader.getAttributeValue(i));
					break;
			}
			i++;
		}
		return vehicle;
	}

	public static Details details(XMLStreamReader reader, Details details) {
		if (details == null)
			details = new Details();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "Name":
					details.setName(reader.getAttributeValue(i));
					break;
				case "PassengerQuantity":
					details.setPassengerQuantity(reader.getAttributeValue(i));
					break;
				case "VehicleCategory":
					details.setCategory(reader.getAttributeValue(i));
					break;
				case "Size":
					details.setSize(reader.getAttributeValue(i));
					break;
				case "Code":
					details.setSipp(reader.getAttributeValue(i));
					break;
				case "TransmissionType":
					details.setTransmission(reader.getAttributeValue(i));
					break;
				case "AirConditionInd":
					details.setAircondition(reader.getAttributeValue(i));
					break;
			}
			i++;
		}
		return details;
	}

	public static Fee fee(XMLStreamReader reader, Fee fee) {
		if(fee == null)
			fee = new Fee();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "Purpose":
					fee.setPurpose(reader.getAttributeValue(i));
					break;
				case "Description":
					fee.setDescription(reader.getAttributeValue(i));
					break;
				case "CurrencyCode":
					fee.setCurrencyCode(reader.getAttributeValue(i));
					break;
				case "Amount":
					fee.setAmount(reader.getAttributeValue(i));
					break;
			}
			i++;
		}		
		return fee;
	}

	public static Calculation calculation(XMLStreamReader reader, Calculation calculation) {
		if(calculation == null)
			calculation = new Calculation();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "Quantity":
					calculation.setQuantity(reader.getAttributeValue(i));
					break;
				case "UnitName":
					calculation.setUnitName(reader.getAttributeValue(i));
					break;
			}
			i++;
		}		
		return calculation;
	}

	public static Total total(XMLStreamReader reader, Total total) {
		if(total == null)
			total = new Total();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "CurrencyCode":
					total.setCurrencyCode(reader.getAttributeValue(i));
					break;
				case "EstimatedTotalAmount":
					total.setEstimatedTotalAmount(reader.getAttributeValue(i));
					break;
				case "RateTotalAmount":
					total.setRateTotalAmount(reader.getAttributeValue(i));
					break;
			}
			i++;
		}	
		return total;
	}

	public static CDW cdw(XMLStreamReader reader, CDW cdw) {
		if(cdw == null)
			cdw = new CDW();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "CurrencyCode":
					cdw.setCurrency(reader.getAttributeValue(i));
					break;
				case "Amount":
					cdw.setExcess(reader.getAttributeValue(i));
					break;
			}
			i++;
		}	
		return cdw;
	}

	public static RateDistance ratedistance(XMLStreamReader reader, RateDistance ratedistance) {
		if(ratedistance == null)
			ratedistance = new RateDistance();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "Unlimited":
					ratedistance.setUnlimited(reader.getAttributeValue(i));
					break;
				case "DistUnitName":
					ratedistance.setDistUnitName(reader.getAttributeValue(i));
					break;
				case "VehiclePeriodUnitName":
					ratedistance.setVehiclePeriodUnitName(reader.getAttributeValue(i));
					break;
				case "Quantity":
					ratedistance.setQuantity(reader.getAttributeValue(i));
					break;
			}
			i++;
		}	
		return ratedistance;
	}

	public static RateQualifier ratequalifier(XMLStreamReader reader, RateQualifier ratequalifier) {
		if(ratequalifier == null)
			ratequalifier = new RateQualifier();
		int i = 0;
		while (i < reader.getAttributeCount()) {
			switch (reader.getAttributeLocalName(i)) {
				case "RateCategory":
					ratequalifier.setRateCategory(reader.getAttributeValue(i));
					break;
				case "RateQualifier":
					ratequalifier.setRateQualifier(reader.getAttributeValue(i));
					break;
			}
			i++;
		}	
		return ratequalifier;
	}

	public static Coverage coverage(XMLStreamReader reader, Coverage coverage) {
		return null;
	}

}
