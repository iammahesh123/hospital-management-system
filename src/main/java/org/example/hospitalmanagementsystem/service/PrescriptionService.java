package org.example.hospitalmanagementsystem.service;

import org.example.hospitalmanagementsystem.model.Prescription;
import org.example.hospitalmanagementsystem.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public void save(Prescription Prescription) {
        prescriptionRepository.save(Prescription);
    }

    public List<Prescription> findByPatientName(String patientName){

        return prescriptionRepository.findByPatientName(patientName);
    }


}
