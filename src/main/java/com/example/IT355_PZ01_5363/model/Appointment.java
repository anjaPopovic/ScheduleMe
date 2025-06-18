package com.example.IT355_PZ01_5363.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private Client client;
    private Treatment treatment;
    private Employee employee;
    private LocalDate date;
    private LocalTime time;
    private String status;
}
