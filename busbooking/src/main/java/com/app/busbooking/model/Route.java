package com.app.busbooking.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTE")
public class Route extends BaseEntity {

	private String stopName;
	private String stopAddress;
	private Long latitude;
	private Long longitude;
	
	
	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public String getStopAddress() {
		return stopAddress;
	}
	public void setStopAddress(String stopAddress) {
		this.stopAddress = stopAddress;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}



}
