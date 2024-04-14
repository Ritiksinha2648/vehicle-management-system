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

import com.vehiclemanagement.bean.Service_Details;
import com.vehiclemanagement.service.DetailService;
@RestController
public class DetailController {
	@Autowired
	private DetailService dservice;
	
	
	
	public DetailService getDservice() {
		return dservice;
	}
	public void setDservice(DetailService dservice) {
		this.dservice = dservice;
	}
	@RequestMapping("/getdetail")
	 public List<Service_Details> getAllvehicle(){
	return  dservice.getAlldetails();
	}
	@PostMapping(value ="/adddetail")
	public void addDetail(@RequestBody Service_Details detail) {
		dservice.addDetail(detail);
	}

	@PutMapping (value="/detail/{detailId}")
	public void updateCustomer(@PathVariable Integer detailId, @RequestBody Service_Details detail) {
	dservice.updateDetail(detailId, detail);
	}
	@DeleteMapping (value="/deletedetail/{detailId}")
	public void deleteCustomer(@PathVariable Integer detailId) {
dservice.deleteDetail(detailId);
	}
}
