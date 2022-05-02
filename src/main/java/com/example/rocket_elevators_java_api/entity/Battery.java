package com.example.rocket_elevators_java_api.entity;

import javax.persistence.*;

@Entity
@Table(name="batteries")
public class Battery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "building_id")
    private String building_id;
    @Column(name = "status")
    private String status;


    public Battery() {
    }

    public Battery(
            String building_id,
            String status
    ) {
        this.building_id = building_id;
        this.status = status;


    }

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

