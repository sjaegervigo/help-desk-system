package com.helpdesk.demo.model;

import jakarta.persistence.*;
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
        fechaCreacion = LocalDateTime.now();
        if ( estado ==null) estado = "OPEN";
    }
}
