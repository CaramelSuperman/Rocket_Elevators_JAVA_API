package com.example.rocket_elevators_java_api.repository;


import com.example.rocket_elevators_java_api.entity.Elevator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ElevatorRepository extends JpaRepository<Elevator, Integer> {


}
