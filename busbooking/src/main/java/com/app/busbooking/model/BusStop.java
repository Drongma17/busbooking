package com.app.busbooking.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Bus_Stopes")
public class BusStop extends BaseEntity{
	
	@ManyToOne
    private Route route;
	
	private Integer kmDifference;
	private Double fare;
	
	

}
