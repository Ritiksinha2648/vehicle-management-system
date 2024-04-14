package com.vehiclemanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehiclemanagement.bean.Service_Details;
import com.vehiclemanagement.repo.DetailRepository;

@Service
@Transactional
public class DetailService {
	@Autowired
	public DetailRepository repo;
	
	 public List<Service_Details> getAlldetails(){
		 List<Service_Details> detail= new ArrayList<>();
	repo.findAll().forEach(detail::add);
	return detail;
	 }
	 public void addDetail(Service_Details detail) {
	repo.save(detail);
	 }
	 public void updateDetail(Integer detailId, Service_Details detail) {
		repo.save(detail);
	 }
	 
	public void deleteDetail(Integer detailId ) {
		repo.deleteById(detailId);
	}

}
