package org.example.hospitalmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "invoice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_Id")
    private Integer invoiceId;

    @Column(name = "patientName")
    private String patientName;

    @Column(name = "appointment_Id")
    private Integer appointmentId;

    @Column(name = "invoice")
    private String invoice;

}
