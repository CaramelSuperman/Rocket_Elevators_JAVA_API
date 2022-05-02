package com.example.rocket_elevators_java_api.entity;

import javax.persistence.*;

@Entity
@Table(name="columns")
public class Columnn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "battery_id")
    private String battery_id;
    @Column(name = "status")
    private String status;


    public Columnn() {
    }

    public Columnn(
            String battery_id,
            String status
    ) {
        this.battery_id = battery_id;
        this.status = status;


    }

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
