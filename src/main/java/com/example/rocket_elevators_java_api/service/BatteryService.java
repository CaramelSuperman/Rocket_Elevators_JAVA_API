package com.example.rocket_elevators_java_api.service;

import com.example.rocket_elevators_java_api.entity.Battery;

import com.example.rocket_elevators_java_api.repository.BatteryRepository;
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
public class BatteryService {
    @Autowired
    private BatteryRepository batteryRepository;



    public List<Battery> listAllBatteries(){
        return batteryRepository.findAll();
    }
    public Battery findBatteryById(Integer id){
        return batteryRepository.findById(id).get();
    }


    public void saveBattery(Battery battery) {
        batteryRepository.save(battery);
    }

    public void deleteById(Integer id) {batteryRepository.deleteById(id);
    }

    @Entity
    public static class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String building_id;
        private String status;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBuilding_id() {
            return building_id;
        }

        public void setBuilding_id(String building_id) {

            this.building_id = building_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
