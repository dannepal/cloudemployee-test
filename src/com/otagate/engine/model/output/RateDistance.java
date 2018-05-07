package com.otagate.engine.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RateDistance")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateDistance {
	@XmlAttribute(name = "Unlimited")
	private String unlimited;
	@XmlAttribute(name = "DistUnitName")
	private String distUnitName;
	@XmlAttribute(name = "VehiclePeriodUnitName")
	private String vehiclePeriodUnitName;
	@XmlAttribute(name = "Quantity")
	private String quantity;

	public RateDistance() {
	}

	public String getUnlimited() {
		return unlimited;
	}

	public void setUnlimited(String unlimited) {
		this.unlimited = unlimited;
	}

	public String getDistUnitName() {
		return distUnitName;
	}

	public void setDistUnitName(String distUnitName) {
		this.distUnitName = distUnitName;
	}

	public String getVehiclePeriodUnitName() {
		return vehiclePeriodUnitName;
	}

	public void setVehiclePeriodUnitName(String vehiclePeriodUnitName) {
		this.vehiclePeriodUnitName = vehiclePeriodUnitName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "RateDistance [unlimited=" + unlimited + ", distUnitName=" + distUnitName + ", vehiclePeriodUnitName="
				+ vehiclePeriodUnitName + ", quantity=" + quantity + "]";
	}

}
