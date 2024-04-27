package org.example.hospitalmanagementsystem.service;

import org.example.hospitalmanagementsystem.model.Invoice;
import org.example.hospitalmanagementsystem.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;


    public void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public List<Invoice> view(){
        return invoiceRepository.findAll();
    }
}
