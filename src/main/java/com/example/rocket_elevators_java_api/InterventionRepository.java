package com.example.rocket_elevators_java_api;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InterventionRepository extends JpaRepository<Intervention, Integer> {


}