package com.example.IT355_PZ01_5363.service;

import com.example.IT355_PZ01_5363.model.Employee;
import com.example.IT355_PZ01_5363.repository.DB;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private final DB db;

    public EmployeeService(DB db) {
        this.db = db;
    }

    @PostConstruct
    public void initEmployees() {
        if (db.getAllEmployees().isEmpty()) {
            db.addEmployee(new Employee("Annie Ryan", "Hairdresser", List.of("Blowdrying", "Hair Coloring")));
            db.addEmployee(new Employee("Henry Black", "Hairdresser", List.of("Balayage", "Hair Dyeing")));
        }
    }

    public List<Employee> getAllEmployees(){
        return db.getAllEmployees();
    }

}
