package com.example.rocket_elevators_java_api.repository;



import com.example.rocket_elevators_java_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {



}