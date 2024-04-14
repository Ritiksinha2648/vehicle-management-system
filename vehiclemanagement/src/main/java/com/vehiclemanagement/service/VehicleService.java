package com.vehiclemanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclemanagement.bean.Vehicle;
import com.vehiclemanagement.repo.VehicleRepository;

@Service
@Transactional

public class VehicleService {
	@Autowired
	public  VehicleRepository repo;
	
	 public List<Vehicle> getAllvehicle(){
		 List<Vehicle> vehicle= new ArrayList<>();
		 repo.findAll().forEach(vehicle::add);
		 return vehicle;
	 }
	 public void addVehicle(Vehicle vehicle) {
		repo.save(vehicle);
	 }
	 public void updateVehicle(Integer vehicleNum, Vehicle vehicle) {
		repo.save(vehicle);
	 }
	 
	public void deletevehicle(Integer vehicleNum ) {
		repo.deleteById(vehicleNum);
	}
}
