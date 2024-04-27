package org.example.hospitalmanagementsystem.controller;

import org.example.hospitalmanagementsystem.model.Appointment;
import org.example.hospitalmanagementsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorAppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping("/doctorAppointments")
    public String showDoctorAppointments(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String doctorName = authentication.getName();
        List<Appointment> doctorAppointments = appointmentService.findByDoctorName(doctorName);
        model.addAttribute("doctorAppointments",doctorAppointments);
        return "doctorAppointment.html";

    }
    @RequestMapping("/createPrescription")
    public String createPrescription() {
        return "createPrescription";
    }
}
