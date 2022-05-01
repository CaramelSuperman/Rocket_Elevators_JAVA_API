package com.example.rocket_elevators_java_api.repository;


import com.example.rocket_elevators_java_api.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention, Integer> {

}