package com.example.IT355_PZ01_5363.service;

import com.example.IT355_PZ01_5363.model.Treatment;
import com.example.IT355_PZ01_5363.repository.DB;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {
    private final DB db;

    public TreatmentService(DB db) {
        this.db = db;
    }

    @PostConstruct
    public void initTreatments() {
       if(db.getAllTreatments().isEmpty()){
           db.addTreatment(new Treatment("Blowdrying", "Short Hair", 30, 1200.0));
           db.addTreatment(new Treatment("Hair Coloring", "Medium Long Hair", 90, 3000.0));
       }
    }

    public List<Treatment> getAllTreatments(){
        return db.getAllTreatments();
    }
}
