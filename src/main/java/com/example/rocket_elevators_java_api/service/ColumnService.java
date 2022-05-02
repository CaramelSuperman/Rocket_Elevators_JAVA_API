package com.example.rocket_elevators_java_api.service;

import com.example.rocket_elevators_java_api.entity.Battery;
import com.example.rocket_elevators_java_api.entity.Columnn;
import com.example.rocket_elevators_java_api.repository.ColumnRepository;
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
public class ColumnService {
    @Autowired
    private ColumnRepository columnRepository;



    public List<Columnn> listAllColumns(){
        return columnRepository.findAll();
    }
    public Columnn findColumnById(Integer id){
        return columnRepository.findById(id).get();
    }


    public void saveColumn(Columnn columnn) {
        columnRepository.save(columnn);
    }

    public void deleteById(Integer id) {columnRepository.deleteById(id);
    }

    @Entity
    public static class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String battery_id;
        private String status;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBattery_id() {
            return battery_id;
        }

        public void setBattery_id(String battery_id) {

            this.battery_id = battery_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
