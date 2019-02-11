package com.app.busbooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="BUS")
public class Bus extends BaseEntity {
	
	private String busStopString;
	
	@OneToOne(fetch=FetchType.LAZY)
	private BusDetail busDetail;
	
	@OneToMany
	private List<PersonDetail> busMainteners;
	
	@OneToMany
	private List<BusStop> defaultBusStopes;
	
	@OneToOne(fetch=FetchType.LAZY)
	private BusType busType;

	
	
	

}
