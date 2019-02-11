package com.app.busbooking.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User extends BaseEntity {
	
	private String email;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL , fetch=FetchType.LAZY)
	private PersonDetail userDetail;

	
	
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

	public PersonDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(PersonDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	

}
