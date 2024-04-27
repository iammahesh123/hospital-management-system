package org.example.hospitalmanagementsystem.repository;

import org.example.hospitalmanagementsystem.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

    List<Prescription> findByPatientName(String patientName);


}
