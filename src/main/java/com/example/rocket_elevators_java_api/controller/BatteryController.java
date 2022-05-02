package com.example.rocket_elevators_java_api.controller;
import com.example.rocket_elevators_java_api.entity.Battery;
import com.example.rocket_elevators_java_api.entity.Intervention;
import com.example.rocket_elevators_java_api.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/batteries")
public class BatteryController {

    @Autowired
    private BatteryService batteryService;

    @GetMapping("/list")
    public List<Battery> getAllBattery(){

        return batteryService.listAllBatteries();
    }

    @GetMapping("/find/{id}")
    public Battery getBatteryById(@PathVariable Integer id) {
        return batteryService.findBatteryById(id);
    }
    @GetMapping("/building/{id}")
    public List<Battery> getAllBuildingsBatteries(@PathVariable String id){

        List<Battery> allBatteriesList = new ArrayList<>();

        for (Battery battery:getAllBattery()) {

            if (battery.getBuilding_id().equals(id)) {

                allBatteriesList.add(battery);
            }
        }
        return allBatteriesList;
    }

}