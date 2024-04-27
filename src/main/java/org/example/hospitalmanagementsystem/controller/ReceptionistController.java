package org.example.hospitalmanagementsystem.controller;

import org.example.hospitalmanagementsystem.model.Appointment;
import org.example.hospitalmanagementsystem.model.Event;
import org.example.hospitalmanagementsystem.model.Invoice;
import org.example.hospitalmanagementsystem.repository.EventRepository;
import org.example.hospitalmanagementsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/receptionist")
public class ReceptionistController {

    @Autowired
    private AppointmentService appointmentService = new AppointmentService();

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/receptionistAppointments")
    public String showReceptionistAppointments(Model model) {
        List<Appointment> listAppointments = appointmentService.listAll();
        model.addAttribute("listAppointments",listAppointments);

        String confirmed = "confirmed";
        model.addAttribute("confirmed",confirmed);
        return "receptionistAppointments";

    }

    @GetMapping("/confirmm")
    public String showConfirmm(Model model) {
        Appointment confirmation = new Appointment();
        model.addAttribute("confirmation",confirmation);
        return "confirm";
    }


    @RequestMapping(value="/receptionistSchedule", method= RequestMethod.GET)
    public String receptionistSchedule(Model model) {
        List<Event> events = eventRepository.findAll();
        model.addAttribute("events",events);
        return "receptionistSchedule";
    }

    @RequestMapping("/findbystart")
    public String showBydate(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        List<Event> event = eventRepository.findByStart(now);
        model.addAttribute("event",event);
        return "scheduleFindByName";
    }


    @RequestMapping("/createInvoice")
    public String createInvoice(Model model) {
        Invoice invoice = new Invoice();
        model.addAttribute("invoice",invoice);
        return "invoice";
    }

}
