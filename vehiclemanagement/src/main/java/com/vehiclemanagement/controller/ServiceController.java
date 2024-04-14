package com.vehiclemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclemanagement.bean.ServiceBean;
import com.vehiclemanagement.service.Service_ser;





@RestController
public class ServiceController {
	@Autowired
	private Service_ser services;
	
	public Service_ser getServices() {
		return services;
	}
	public void setServices(Service_ser services) {
		this.services = services;
	}
	
	@RequestMapping("/getService")
	 public List<ServiceBean> getAllcustomers(){
		return services.getAllservices();
	}
	@PostMapping(value ="/addService")
	public void addService(@RequestBody ServiceBean service) {
		services.addService(service);
	}

	
	@PutMapping (value="/Service/{serviceNum}")
	public void updateService(@PathVariable Integer serviceNum, @RequestBody ServiceBean service) {
		services.updateService(serviceNum, service);
	}
	@DeleteMapping (value="/deleteService/{serviceNum}")
	public void deleteService(@PathVariable Integer serviceNum) {
		services.deleteService(serviceNum);
	}

}
