package org.example.hospitalmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "prescription")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_Id")
    private Integer prescriptionId;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "appointment_Id")
    private String appointmentId;

    @Column(name = "description")
    private String description;

    @Column(name = "doctorName")
    private String doctorName;

}
