package com.vehiclemanagement.bean;

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
@Table(name="service")
public class ServiceBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceNum;
	private String serviceType;
	private double cost;
	private String serviceDescription;

	 @ManyToOne
	 @JoinColumn(name="vehicleNum", referencedColumnName ="vehicleNum")
	private Vehicle vehicleNum;
	 
	 @OneToMany(mappedBy = "serviceNum")
     private List<Service_Details> detail;
	 
	public ServiceBean() {
		super();

	}
	
	public ServiceBean(Integer serviceNum, String serviceType, double cost, String serviceDescription) {
		super();
		this.serviceNum = serviceNum;
		this.serviceType = serviceType;
		this.cost = cost;
		this.serviceDescription = serviceDescription;
	}

	public Integer getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(Integer serviceNum) {
		this.serviceNum = serviceNum;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Vehicle getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(Vehicle vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	

}
