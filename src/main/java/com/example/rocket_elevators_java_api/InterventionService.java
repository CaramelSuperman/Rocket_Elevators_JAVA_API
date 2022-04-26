package com.example.rocket_elevators_java_api;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InterventionService {
    private InterventionRepository interventionRepository;

    public InterventionService(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }

    public List<Intervention> listAllInterventions(){
        return interventionRepository.findAll();
    }
    public Intervention getIntervention(Integer id){
        return interventionRepository.findById(id).get();
    }
}
