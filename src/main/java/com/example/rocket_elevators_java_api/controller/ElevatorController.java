package com.example.rocket_elevators_java_api.controller;

import com.example.rocket_elevators_java_api.entity.Battery;
import com.example.rocket_elevators_java_api.entity.Elevator;
import com.example.rocket_elevators_java_api.service.ElevatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/elevators")
public class ElevatorController {

    @Autowired
    private ElevatorService elevatorService;

    @GetMapping("/list")
    public List<Elevator> getAllElevators(){

        return elevatorService.listAllElevators();
    }
    @GetMapping("/find/{id}")
    public Elevator getElevatorById(@PathVariable Integer id) {
        return elevatorService.findElevatorById(id);
    }
    @GetMapping("/columns/{id}")
    public List<Elevator> getAllColumnsElevators(@PathVariable String id){

        List<Elevator> allElevatorsList = new ArrayList<>();

        for (Elevator elevator:getAllElevators()) {

            if (elevator.getColumn_id().equals(id)) {

                allElevatorsList.add(elevator);
            }
        }
        return allElevatorsList;
    }

}