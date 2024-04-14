package com.vehiclemanagement.bean;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custNum;
	private String name;
	private String street;
	private String city;
	private String state;
	private Integer pincode;
	private String phoneNo;
    private String emailId;
    @OneToMany(mappedBy = "custNum")
     private List<Vehicle> vehicle;
    
	public Customer() {
		super();
	
	}
	public Customer(Integer custNum, String name, String street, String city, String state, Integer pincode,
			String phoneNo, String emailId) {
		super();
		this.custNum = custNum;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		
	}

	public Integer getCustNum() {
		return custNum;
	}
	public void setCustNum(Integer custNum) {
		this.custNum = custNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}







}
