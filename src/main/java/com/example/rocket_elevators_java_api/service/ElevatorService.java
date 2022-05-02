package com.example.rocket_elevators_java_api.service;


import com.example.rocket_elevators_java_api.entity.Elevator;
import com.example.rocket_elevators_java_api.repository.ElevatorRepository;
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
public class ElevatorService {
    @Autowired
    private ElevatorRepository elevatorRepository;



    public List<Elevator> listAllElevators(){
        return elevatorRepository.findAll();
    }
    public Elevator findElevatorById(Integer id){
        return elevatorRepository.findById(id).get();
    }


    public void saveElevator(Elevator elevator) {
        elevatorRepository.save(elevator);
    }

    public void deleteById(Integer id) {elevatorRepository.deleteById(id);
    }

    @Entity
    public static class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String column_id;
        private String status;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getColumn_id() {
            return column_id;
        }

        public void setColumn_id(String column_id) {

            this.column_id = column_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
