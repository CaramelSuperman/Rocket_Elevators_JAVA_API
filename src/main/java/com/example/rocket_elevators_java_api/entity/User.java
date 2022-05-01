package com.example.rocket_elevators_java_api.entity;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    private String username;
    @Column(name = "encrypted_password")
    private String password;


    public User() {
    }

    public User(
            String email,
            String encrypted_password
    ) {
        this.username = username;
        this.password = password;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

