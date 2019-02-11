package com.app.busbooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_OPERATOR")
public class UserOperator extends BaseEntity {

	private String email;
	private String password;
	private String userType;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private PersonDetail operatorDetail;

	@OneToMany
	private List<Bus> ownerOfBuses;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	

	public PersonDetail getOperatorDetail() {
		return operatorDetail;
	}

	public void setOperatorDetail(PersonDetail operatorDetail) {
		this.operatorDetail = operatorDetail;
	}

	public List<Bus> getOwnerOfBuses() {
		return ownerOfBuses;
	}

	public void setOwnerOfBuses(List<Bus> ownerOfBuses) {
		this.ownerOfBuses = ownerOfBuses;
	}

}
