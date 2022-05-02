package com.example.rocket_elevators_java_api.controller;

import com.example.rocket_elevators_java_api.entity.Battery;
import com.example.rocket_elevators_java_api.entity.Columnn;
import com.example.rocket_elevators_java_api.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/columns")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

    @GetMapping("/list")
    public List<Columnn> getAllColumns(){

        return columnService.listAllColumns();
    }
    @GetMapping("/find/{id}")
    public Columnn getColumnById(@PathVariable Integer id) {
        return columnService.findColumnById(id);
    }
    @GetMapping("/battery/{id}")
    public List<Columnn> getAllBatteryColumns(@PathVariable String id){

        List<Columnn> allColumnsList = new ArrayList<>();

        for (Columnn columnn:getAllColumns()) {

            if (columnn.getBattery_id().equals(id)) {

                allColumnsList.add(columnn);
            }
        }
        return allColumnsList;
    }

}