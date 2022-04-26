package com.example.rocket_elevators_java_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InterventionService {
    @Autowired
    private InterventionRepository interventionRepository;

/*    public InterventionService(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }*/

    public List<Intervention> listAllInterventions(){
        return interventionRepository.findAll();
    }
    public Intervention findInterventionById(Integer id){
        return interventionRepository.findById(id).get();
    }


    public void saveIntervention(Intervention intervention) {
        interventionRepository.save(intervention);
    }
}
