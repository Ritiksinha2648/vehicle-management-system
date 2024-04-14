package com.vehiclemanagement.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleNum;
	private String type;
	private String model;
	private Integer manufactureYear;
	private Date dateOfPurchase;
	private Integer lastKilometerRun;
	private Date lastServiceDate;

	 @ManyToOne
	 @JoinColumn(name="custNum", referencedColumnName ="custNum")
	private Customer custNum;
	    @OneToMany(mappedBy = "vehicleNum")
	     private List<ServiceBean> service;
	
	public Vehicle() {
		super();
		
	}
	


	public Vehicle(Integer vehicleNum, String type, String model, Integer manufactureYear, Date dateOfPurchase,
			Integer lastKilometerRun, Date lastServiceDate, Customer custNum) {
		super();
		this.vehicleNum = vehicleNum;
		this.type = type;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.dateOfPurchase = dateOfPurchase;
		this.lastKilometerRun = lastKilometerRun;
		this.lastServiceDate = lastServiceDate;
		this.custNum = custNum;
	}



	public Integer getVehicleNum() {
		return vehicleNum;
	}
	public void setVehicleNum(Integer vehicleNum) {
		this.vehicleNum = vehicleNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(Integer manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public Integer getLastKilometerRun() {
		return lastKilometerRun;
	}
	public void setLastKilometerRun(Integer lastKilometerRun) {
		this.lastKilometerRun = lastKilometerRun;
	}
	public Date getLastServiceDate() {
		return lastServiceDate;
	}
	public void setLastServiceDate(Date lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}



	public Customer getCustNum() {
		return custNum;
	}



	public void setCustNum(Customer custNum) {
		this.custNum = custNum;
	}



}
