package com.vehiclemanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclemanagement.bean.ServiceBean;
import com.vehiclemanagement.repo.ServiceRepository;

@Service
@Transactional
public class Service_ser {
	@Autowired
	public ServiceRepository repo;
	 public List<ServiceBean> getAllservices(){
		 List<ServiceBean> service= new ArrayList<>();
		 repo.findAll().forEach(service::add);
		 return service;
	 }
	 public void addService(ServiceBean service) {
		repo.save(service);
	 }
	 public void updateService(Integer serviceNum, ServiceBean service) {
		repo.save(service);
	 }
	 
	public void deleteService(Integer serviceNum ) {
		repo.deleteById(serviceNum);
	}
}
