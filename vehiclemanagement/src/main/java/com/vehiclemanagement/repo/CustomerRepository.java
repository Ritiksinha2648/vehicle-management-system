package com.vehiclemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehiclemanagement.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer ,Integer>{

}
