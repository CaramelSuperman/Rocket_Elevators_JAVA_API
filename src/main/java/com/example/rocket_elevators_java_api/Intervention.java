package com.example.rocket_elevators_java_api;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="interventions")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="customerID")
    private String customerId;
    @Column(name="buildingID")
    private int buildingId;
    @Column(name="batteryID")
    private int batteryId;
    @Column(name="columnID")
    private int columnId;
    @Column(name="elevatorID")
    private int elevatorId;
    @Column(name="employeeID")
    private int employeeId;

    private Instant start_date_and_time_of_the_intervention;
    private Instant end_date_and_time_of_the_intervention;

    private String result;
    private String report;
    private String status;


    public Intervention() {
    }

    public Intervention(
            String customerId,
            int buildingId,
            int batteryId,
            int columnId,
            int elevatorId,
            int employeeId,
            String report
    ) {
        this.customerId = customerId;
        this.buildingId = buildingId;
        this.batteryId = batteryId;
        this.columnId = columnId;
        this.elevatorId = elevatorId;
        this.employeeId = employeeId;
        this.report = report;

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getStart_date_and_time_of_the_intervention() {
        return start_date_and_time_of_the_intervention;
    }

    public void setStart_date_and_time_of_the_intervention(Instant start_date_and_time_of_the_intervention) {
        this.start_date_and_time_of_the_intervention = start_date_and_time_of_the_intervention;
    }

    public Instant getEnd_date_and_time_of_the_intervention() {
        return end_date_and_time_of_the_intervention;
    }

    public void setEnd_date_and_time_of_the_intervention(Instant end_date_and_time_of_the_intervention) {
        this.end_date_and_time_of_the_intervention = end_date_and_time_of_the_intervention;
    }
}
