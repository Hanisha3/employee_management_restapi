package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;

    private String firstName;

    private String lastName;

    private String location;

    private Integer salary;

    private Integer noOfYearsOfExperience;



}
