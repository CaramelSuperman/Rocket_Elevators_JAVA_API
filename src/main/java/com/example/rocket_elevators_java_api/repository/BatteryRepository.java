package com.example.rocket_elevators_java_api.repository;


import com.example.rocket_elevators_java_api.entity.Battery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteryRepository extends JpaRepository<Battery, Integer> {

}