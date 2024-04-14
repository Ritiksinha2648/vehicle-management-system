package com.vehiclemanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.vehiclemanagement.bean.ServiceBean;

public interface ServiceRepository extends CrudRepository<ServiceBean ,Integer>{

}
