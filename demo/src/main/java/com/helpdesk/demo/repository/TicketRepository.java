package com.helpdesk.demo.repository;

import com.helpdesk.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Aquí ya tienes métodos como save(), findAll(), delete() gratis.
}
