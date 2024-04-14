package com.vehiclemanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclemanagement.bean.Customer;
import com.vehiclemanagement.repo.CustomerRepository;
@Service
@Transactional
public class CustomerService {
	@Autowired
public CustomerRepository repo;
	
 public List<Customer> getAllcustomers(){
	 List<Customer> customer= new ArrayList<>();
	 repo.findAll().forEach(customer::add);
	 return customer;
 }
 public void addCustomer(Customer customer) {
	repo.save(customer);
 }
 public void updateCustomer(Integer custNum, Customer customer) {
	repo.save(customer);
 }
 
public void deleteCustomer(Integer custNum ) {
	repo.deleteById(custNum);
}

}
