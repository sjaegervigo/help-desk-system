package com.helpdesk.demo.controller;

import com.helpdesk.demo.model.Ticket;
import com.helpdesk.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketRepository.save(ticket);
    }
}
