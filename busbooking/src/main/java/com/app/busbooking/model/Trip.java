package com.app.busbooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRIP")
public class Trip extends BaseEntity{
	
	@OneToOne(fetch=FetchType.LAZY)
	private Bus bus;
	
	private String deperatureTime;
	private String arrivalTime;
	private Boolean isReverseTrip;
	private String tripStatus;
	
    private Integer totalBookedSeat;
    private String bookedSeats;
    
    @OneToMany
	private List<Booking> bookingList;
    
    
    


    
    
    

}
