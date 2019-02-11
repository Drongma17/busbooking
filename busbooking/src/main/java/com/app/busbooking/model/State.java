package com.app.busbooking.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STATE")
public class State extends BaseEntity{
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
