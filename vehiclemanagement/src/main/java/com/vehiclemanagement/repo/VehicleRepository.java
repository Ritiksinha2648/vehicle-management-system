package com.vehiclemanagement.repo;


import org.springframework.data.repository.CrudRepository;

import com.vehiclemanagement.bean.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle,Integer>{

}
