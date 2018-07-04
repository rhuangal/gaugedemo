package com.rhuangal.gaugedemo.repository;


import com.rhuangal.gaugedemo.model.SensorModel;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<SensorModel, Integer> {

    SensorModel findTopByOrderByIdDesc();
}
