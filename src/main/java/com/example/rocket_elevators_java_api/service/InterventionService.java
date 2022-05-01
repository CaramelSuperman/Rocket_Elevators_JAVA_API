package com.example.rocket_elevators_java_api.service;

import com.example.rocket_elevators_java_api.entity.Intervention;
import com.example.rocket_elevators_java_api.repository.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public void deleteById(Integer id) {interventionRepository.deleteById(id);
    }

    @Entity
    public static class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String firstName;
        private String lastName;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
