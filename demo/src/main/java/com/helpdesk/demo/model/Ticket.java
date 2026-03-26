package com.helpdesk.demo.model;

import jakarta.persitance.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String estado;
    private String prioridad;

    private LocalDateTime fechaCreacion;

    @PrePersist
    protected void onCreate(){
        fechaCreation = LocalDateTime.now();
        if ( estado ==null) estado = "OPEN"
    }
}
