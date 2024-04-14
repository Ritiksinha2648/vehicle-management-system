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

import com.vehiclemanagement.bean.Customer;
import com.vehiclemanagement.service.CustomerService;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService custservice;
	
	public CustomerService getCustservice() {
		return custservice;
	}
	public void setCustservice(CustomerService custservice) {
		this.custservice = custservice;
	}
	@RequestMapping("getCustomer")
	 public List<Customer> getAllcustomers(){
		return custservice.getAllcustomers();
	}
	@PostMapping(value ="/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		custservice.addCustomer(customer);
	}

	
	@PutMapping (value="/Customer/{custNum}")
	public void updateCustomer(@PathVariable Integer custNum, @RequestBody Customer customer) {
		custservice.updateCustomer(custNum, customer);
	}
	@DeleteMapping (value="/deletecustomer/{custNum}")
	public void deleteCustomer(@PathVariable Integer custNum) {
		custservice.deleteCustomer(custNum);
	}


}

