package org.example.hospitalmanagementsystem.repository;

import org.example.hospitalmanagementsystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findByDoctorName(String doctorName);


    List<Appointment> findByPatientName(String patientName);

    @Modifying
    @Query("update Appointment a set a.confirmed = ?1 where a.appointmentId = ?2")
    int setConfirmation(String confitmation, Integer id);


    @Modifying
    @Query("update Appointment a set a.prescription = ?1 where a.appointmentId = ?2")
    int setPrescription(String prescription, Integer id);

    @Query(value="select * from appointment a where a.appointment_date =?1 AND a.doctor_name =?2", nativeQuery=true)
    List<Appointment> findByDate(String date,String doctorName);
}
