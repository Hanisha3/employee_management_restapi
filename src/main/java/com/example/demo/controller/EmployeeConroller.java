package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("emp_management/api/v1")
public class EmployeeConroller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/addEmployee")
    public Employee addNewEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee){
        return this.employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        this.employeeService.deleteEmployee(id);
    }

    @GetMapping("/fetchEmployee/{id}")
    public Employee fetchEmployee(@PathVariable Integer id){
        return this.employeeService.fetchEmployee(id);
    }
}

