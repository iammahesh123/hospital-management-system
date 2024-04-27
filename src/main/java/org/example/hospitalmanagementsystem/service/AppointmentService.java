package org.example.hospitalmanagementsystem.service;

import jakarta.transaction.Transactional;
import org.example.hospitalmanagementsystem.model.Appointment;
import org.example.hospitalmanagementsystem.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AppointmentService {

    private AppointmentRepository appointmentRepository;

    public List<Appointment> listAll() {
        return appointmentRepository.findAll();

    }

    public void save(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public void deleteById(Integer appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }

    public int setConfirmation(String conform, Integer id) {
        return appointmentRepository.setConfirmation(conform,id);
    }

    public int setPrescription(String confirmation, Integer id) {
        return appointmentRepository.setPrescription(confirmation, id);
    }

    public Optional<Appointment> get(Integer id) {
        return appointmentRepository.findById(id);

    }

    public List<Appointment> findByPatientName(String patientName)
    {
        return appointmentRepository.findByPatientName(patientName);
    }

    public List<Appointment> findByDoctorName(String doctorName)
    {
        return appointmentRepository.findByDoctorName(doctorName);
    }

    public List<Appointment> findByDate(String date, String doctorName){
        return appointmentRepository.findByDate(date, doctorName);
    }
}
