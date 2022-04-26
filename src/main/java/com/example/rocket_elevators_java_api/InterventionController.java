package com.example.rocket_elevators_java_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interventions")
public class InterventionController {
    @Autowired
    private InterventionService interventionService;

/*    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }*/

    @GetMapping("/list")
    public List<Intervention> getAllInterventions(){
        return interventionService.listAllInterventions();
    }

    @GetMapping("/find/{id}")
    public Intervention getInterventionById(@PathVariable Integer id){
        return interventionService.findInterventionById(id);
    }

    @PostMapping("/add") // POST requests for /add
    public void Intervention(@RequestBody Intervention intervention) {
        interventionService.saveIntervention(intervention);
    }
}
