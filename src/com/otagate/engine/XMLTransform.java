package com.otagate.engine;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.otagate.engine.model.output.*;

public class XMLTransform implements XMLTransformIface {

	private Companies companies;
	
	@Override
	public void transform(String xml) {
		String xmlString = null;
		try {
			if(!xml.toLowerCase().startsWith("<") || new File(xml).exists())
				xmlString = xml2String(xml);
			else 
				xmlString = xml;
			
			parseXml(xmlString);
			transformXml();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String xml2String(String xmlFile) throws IOException {
		Reader fileReader = new FileReader(xmlFile);
		BufferedReader bufReader = new BufferedReader(fileReader);

		StringBuilder sb = new StringBuilder();
		String line = bufReader.readLine();
		while (line != null) {
			sb.append(line).append("\n");
			line = bufReader.readLine();
		}

		String xml2String = sb.toString();
		bufReader.close();

		return xml2String;
	}

	private void parseXml(String fileName) throws XMLStreamException {

		Company company = null;
		Vehicle vehicle = null;
		Details details = null;
		Fees fees = null;
		Fee fee = null;
		Calculation calculation = null;
		Total total = null;
		CDW cdw = null;
		RateDistance ratedistance = null;
		RateQualifier ratequalifier = null;
		Coverage coverage = null;
		boolean isPictureUrl = false;

		XMLInputFactory factory = XMLInputFactory.newInstance();
		InputStream stream = new ByteArrayInputStream(fileName.getBytes());
		XMLStreamReader reader = factory.createXMLStreamReader(stream);

		while (reader.hasNext()) {
			int event = reader.next();

			switch (event) {
			case XMLStreamConstants.START_ELEMENT: {
				
				switch (reader.getLocalName()) {
				case "VehRentalCore":
					if (reader.getAttributeCount() > 0) {
						companies = (Companies) XMLTransformMappers.companies(reader, companies);
					}
					break;
				case "CountryName":
					if (reader.getAttributeCount() > 0) {
						companies = XMLTransformMappers.companies(reader, companies);
					}
					break;
				case "Success": {
					break;
				}
				case "PickUpLocation":
					if (reader.getAttributeCount() > 0) {
						company = XMLTransformMappers.company(reader, "PickUpLocation", company);
					}
					break;
				case "ReturnLocation":
					if (reader.getAttributeCount() > 0) {
						company = XMLTransformMappers.company(reader, "ReturnLocation", company);
					}
					break;
				case "VehAvailCore":
					if (reader.getAttributeCount() > 0) {
						vehicle = XMLTransformMappers.vehicle(reader, vehicle);
						details = XMLTransformMappers.details(reader, details);
					}
					break;
				case "Vehicle":
					if (reader.getAttributeCount() > 0) {
						vehicle = XMLTransformMappers.vehicle(reader, vehicle);
						details = XMLTransformMappers.details(reader, details);
					}
					break;
				case "PictureURL":
					isPictureUrl = true;
					break;
				case "VehType":
				case "VehClass":
				case "VehMakeModel":
					if (reader.getAttributeCount() > 0) {
						details = XMLTransformMappers.details(reader, details);
					}
					break;
				case "VehicleCharges":
					if(fees == null)
						fees = new Fees();
					fees.setFees(new ArrayList<Fee>());
					break;
				case "VehicleCharge":
					if (reader.getAttributeCount() > 0) {
						fee = XMLTransformMappers.fee(reader, fee);
					}
					break;
				case "Calculation":
					if (reader.getAttributeCount() > 0) {
						calculation = XMLTransformMappers.calculation(reader, calculation);
						if(fee == null)
							fee = new Fee();
						fee.setCalculation(calculation);
					}
					break;
				case "TotalCharge":
					if (reader.getAttributeCount() > 0) {
						total = XMLTransformMappers.total(reader, total);
					}
					break;
				case "Deductible":
					if (reader.getAttributeCount() > 0) {
						cdw = XMLTransformMappers.cdw(reader, cdw);
					}
					break;
				case "RateDistance":
					if (reader.getAttributeCount() > 0) {
						ratedistance = XMLTransformMappers.ratedistance(reader, ratedistance);
					}
					break;
				case "RateQualifier":
					if (reader.getAttributeCount() > 0) {
						ratequalifier = XMLTransformMappers.ratequalifier(reader, ratequalifier);
					}
					break;
				case "PricedCoverage":
					if (reader.getAttributeCount() > 0) {
						coverage = XMLTransformMappers.coverage(reader, coverage);
					}
					break;
				}
				break;
			}

			case XMLStreamConstants.CHARACTERS: {
				if (isPictureUrl) {
					if (details == null)
						details = new Details();
					if(details.getImage() == null)
						details.setImage(new Image());
					details.getImage().setImageValue(reader.getText().trim());
					isPictureUrl = false;
				}
				break;
			}

			case XMLStreamConstants.END_ELEMENT: {
				switch(reader.getLocalName()) {
					case "VehicleCharges":
						if(fees != null) {
							if(vehicle == null)
								vehicle = new Vehicle();
							vehicle.setFees(fees);
							fees = null;
						}
						break;
					case "VehicleCharge":
						if(fee != null) {
							if(fees == null)
								fees = new Fees();
							if(fees.getFees() == null)
								fees.setFees(new ArrayList<Fee>());
							fees.getFees().add(fee);
							fee = null;
							calculation = null;
						}
						break;
					case "TotalCharge":
						if(total != null) {
							if(vehicle == null)
								vehicle = new Vehicle();
							vehicle.setTotal(total);
							total = null;
						}	
						break;
					case "Deductible":
						if(cdw != null) {
							if(vehicle == null)
								vehicle = new Vehicle();
							vehicle.setCdw(cdw);
							cdw = null;
						}	
						break;
					case "RateDistance":
						if(ratedistance != null) {
							if(vehicle == null)
								vehicle = new Vehicle();
							vehicle.setRateDistance(ratedistance);
							ratedistance = null;
						}	
						break;
					case "RateQualifier":
						if(ratequalifier != null) {
							if(vehicle == null)
								vehicle = new Vehicle();
							vehicle.setRateQualifier(ratequalifier);
							ratequalifier = null;
						}	
						break;
					case "Vehicle" :
						if(vehicle == null)
							vehicle = new Vehicle();
						if(details != null) {
							vehicle.setDetails(details);
							details = null;
						}
						break;
					case "VehAvail":
						if(company == null)
							company = new Company();
						if(company.getVehicles() == null)
							company.setVehicle(new ArrayList<Vehicle>());
						company.getVehicles().add(vehicle);
						vehicle = null;
						break;
				}
				
				break;
			}

			case XMLStreamConstants.START_DOCUMENT:
				break;
			}
		}
		
		if(companies != null) {
			if(companies.getCompanies() == null)
				companies.setCompanies(new ArrayList<Company>());
			if(company != null)
				companies.getCompanies().add(company);
		}
	}

	private void transformXml() {
		try {
			JAXBContext jc = JAXBContext.newInstance(Companies.class);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(companies, System.out);
			
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
