package com.example.rocket_elevators_java_api.controller;


import com.example.rocket_elevators_java_api.repository.InterventionRepository;
import com.example.rocket_elevators_java_api.service.InterventionService;
import com.example.rocket_elevators_java_api.entity.Intervention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interventions")
public class InterventionController {
    @Autowired
    private InterventionService interventionService;


    @GetMapping("/list")
    public List<Intervention> getAllInterventions() {
        return interventionService.listAllInterventions();
    }

    @GetMapping("/find/{id}")
    public Intervention getInterventionById(@PathVariable Integer id) {
        return interventionService.findInterventionById(id);
    }

    @PostMapping("/add") // POST requests for /add
    public void Intervention(@RequestBody Intervention intervention) {
        interventionService.saveIntervention(intervention);
        String customerId = intervention.getCustomerId();

        if(customerId != null) {
            Integer customerIdString = Integer.parseInt(customerId);
            if(customerIdString < 1) throw new RuntimeException();
        } else {
            throw new RuntimeException("No customer with this name");
        }    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteIntervention(@PathVariable Integer id) {
        Intervention deleteIntervention = interventionService.findInterventionById(id);
        if (deleteIntervention.getStatus().equals("Pending")) {
            if (!interventionService.findInterventionById(id).equals(Optional.empty())) {
                interventionService.deleteById(id);
                return true;
            }

        }
        return false;
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Intervention> updateIntervention(@PathVariable Integer id, @RequestBody Intervention interventionDetails) {


            Intervention updateIntervention = interventionService.findInterventionById(id);
                if(updateIntervention.getStatus().equals("Pending")) {
                    updateIntervention.setCustomerId(interventionDetails.getCustomerId());
                    updateIntervention.setBuildingId(interventionDetails.getBuildingId());
                    updateIntervention.setBatteryId(interventionDetails.getBatteryId());
                    updateIntervention.setColumnId(interventionDetails.getColumnId());
                    updateIntervention.setElevatorId(interventionDetails.getElevatorId());
                    updateIntervention.setEmployeeId(interventionDetails.getEmployeeId());
                    updateIntervention.setStatus(interventionDetails.getStatus());
                    updateIntervention.setReport(interventionDetails.getReport());
                    updateIntervention.setResult(interventionDetails.getResult());


                    interventionService.saveIntervention(updateIntervention);
                }
        return ResponseEntity.ok(updateIntervention);
        }
    @GetMapping("/customer/{id}")
    public List<Intervention> getAllCustomersIntervention(@PathVariable String id){

        List<Intervention> allInterventionsList = new ArrayList<>();

        for (Intervention intervention:getAllInterventions()) {

            if (intervention.getCustomerId().equals(id)) {

                allInterventionsList.add(intervention);
            }
        }
        return allInterventionsList;
    }
    }


