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

import com.vehiclemanagement.bean.Vehicle;
import com.vehiclemanagement.service.VehicleService;


@RestController
public class VehicleController {
	@Autowired
	private VehicleService vehicleservice;
	


	public VehicleService getVehicleservice() {
		return vehicleservice;
	}
	public void setVehicleservice(VehicleService vehicleservice) {
		this.vehicleservice = vehicleservice;
	}
	@RequestMapping("/getvehicle")
	 public List<Vehicle> getAllvehicle(){
	return vehicleservice.getAllvehicle();
	}
	@PostMapping(value ="/addvehicle")
	public void addCustomer(@RequestBody Vehicle vehicle) {
		vehicleservice.addVehicle(vehicle);
	}

	@PutMapping (value="/vehicle/{vehicleNum}")
	public void updateCustomer(@PathVariable Integer vehicleNum, @RequestBody Vehicle vehicle) {
		vehicleservice.updateVehicle(vehicleNum, vehicle);
	}
	@DeleteMapping (value="/deletevehicle/{vehicleNum}")
	public void deleteCustomer(@PathVariable Integer vehicleNum) {
	vehicleservice.deletevehicle(vehicleNum);
	}

}
