package com.example.rocket_elevators_java_api;

import javax.persistence.*;

@Entity
@Table(name="interventions")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public String author;
    public String customerID;
    public Integer buildingID;
    public Integer batteryID;
    public Integer columnID;
    public Integer elevatorID;
    public Integer employeeID;
    // public DateTimeFormatter start_date_and_time_of_the_intervention;
    //public DateTimeFormatter end_date_and_time_of_the_intervention;
    public String result;
    public String report;
    public String status;

    public Intervention(){}
    public Intervention(int id){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
