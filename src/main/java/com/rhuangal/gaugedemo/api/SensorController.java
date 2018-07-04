package com.rhuangal.gaugedemo.api;

import com.rhuangal.gaugedemo.model.SensorModel;
import com.rhuangal.gaugedemo.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sensor")
public class SensorController {

    @Autowired
    SensorRepository valueRepository;

    @GetMapping("/last")
    public int getLastValue(){
        SensorModel valueModel = valueRepository.findTopByOrderByIdDesc();
        return valueModel.getValue();
    }

}
