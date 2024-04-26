package org.example.hospitalmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "appointment")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Integer appointmentId;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "doctorName")
    private String doctorName;

    @Column(name = "date")
    private String date;

    @Column(name = "prescription")
    private String prescription;

    @Column(name = "confirmed")
    private String confirmed;


}
