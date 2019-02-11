package com.app.busbooking.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BUS_TYPE")
public class BusType extends BaseEntity {

	private String busType;
	private Boolean isAc;
	private Integer busFarePerKML;
	
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Integer getBusFarePerKML() {
		return busFarePerKML;
	}
	public void setBusFarePerKML(Integer busFarePerKML) {
		this.busFarePerKML = busFarePerKML;
	}
	
	
	
}
