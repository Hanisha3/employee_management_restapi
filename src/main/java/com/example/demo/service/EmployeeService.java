package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //add employee data
    public Employee addEmployee(Employee employee){
        this.employeeRepository.save(employee);
        return employee;
    }
    // get all employees
    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }

    //update employee
    public Employee updateEmployee(Integer id, Employee newEmployeeData){
        Employee oldEmployeeData = this.employeeRepository.findById(id).get();
        oldEmployeeData.setFirstName(newEmployeeData.getFirstName());
        oldEmployeeData.setLastName(newEmployeeData.getLastName());
        oldEmployeeData.setLocation(newEmployeeData.getLocation());
        oldEmployeeData.setNoOfYearsOfExperience(newEmployeeData.getNoOfYearsOfExperience());
        oldEmployeeData.setSalary(newEmployeeData.getSalary());
        this.employeeRepository.save(oldEmployeeData);

        return oldEmployeeData;
    }

    // delete employee

    public void deleteEmployee(Integer id){
        this.employeeRepository.deleteById(id);
    }

    public Employee fetchEmployee(Integer id){
       Employee selectedEmployee = this.employeeRepository.findById(id).get();
       return selectedEmployee;

    }
}
