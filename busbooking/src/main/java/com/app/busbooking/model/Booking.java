package com.app.busbooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BOOKING")
public class Booking extends BaseEntity {

	@OneToOne(cascade=CascadeType.ALL , fetch=FetchType.LAZY)
	private User user;
	
	private String pickupLocation;
	private String dropLocation;
	private String travelTime;
	private Integer totalSeat;
	private double fare;
	private String seatNumbers;
	
	


	

	
	
}
