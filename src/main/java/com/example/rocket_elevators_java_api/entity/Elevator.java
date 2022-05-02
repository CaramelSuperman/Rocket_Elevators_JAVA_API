package com.example.rocket_elevators_java_api.entity;

import javax.persistence.*;

@Entity
@Table(name="elevators")
public class Elevator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "column_id")
    private String column_id;
    @Column(name = "status")
    private String status;


    public Elevator() {
    }

    public Elevator(
            String column_id,
            String status
    ) {
        this.column_id = column_id;
        this.status = status;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumn_id() {
        return column_id;
    }

    public void setColumn_id(String column_id) {
        this.column_id = column_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
