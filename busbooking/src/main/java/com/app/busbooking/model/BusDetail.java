package com.app.busbooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="BUS_DETAIL")
public class BusDetail extends BaseEntity {
	
	private String busName;
	private String busNumber;

	private Double busLength;
	private Double busHeight;
	private Double busWidth;
	
	private Integer totalSeats;
	private Integer totalLowerDeckSeats;
	private Integer totalUpperDeckSeats;
	private String lowerDeckSeatNumber;
	private String upperDeckSetaNumber;
	
	private Integer lowerRightRow;
	private Integer lowerLeftRow;
	private Integer lowerColumn;
	
	private Integer upperRightRow;
	private Integer upperLeftRow;
	private Integer upperColumn;

	private String busImageUrl;
	
	
	



}
