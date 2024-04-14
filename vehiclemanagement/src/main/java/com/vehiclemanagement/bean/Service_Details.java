package com.vehiclemanagement.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="service_detail")
public class Service_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer detailId;
private String serviceName;
private double spareProductCost;
private double labourCost;

@ManyToOne
@JoinColumn(name="serviceNum", referencedColumnName ="serviceNum")
private ServiceBean serviceNum;


public Service_Details() {
	super();
	
}

public Service_Details(Integer detailId, String serviceName, double spareProductCost, double labourCost) {
	super();
	this.detailId = detailId;
	this.serviceName = serviceName;
	this.spareProductCost = spareProductCost;
	this.labourCost = labourCost;
}

public Integer getDetailId() {
	return detailId;
}
public void setDetailId(Integer detailId) {
	this.detailId = detailId;
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public double getSpareProductCost() {
	return spareProductCost;
}
public void setSpareProductCost(double spareProductCost) {
	this.spareProductCost = spareProductCost;
}
public double getLabourCost() {
	return labourCost;
}
public void setLabourCost(double labourCost) {
	this.labourCost = labourCost;
}

public ServiceBean getServiceNum() {
	return serviceNum;
}

public void setServiceNum(ServiceBean serviceNum) {
	this.serviceNum = serviceNum;
}



}
