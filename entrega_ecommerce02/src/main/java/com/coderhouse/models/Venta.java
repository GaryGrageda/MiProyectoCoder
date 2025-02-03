package com.coderhouse.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ventas")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    private LocalDateTime fecha;

    public Venta() {
        this.fecha = LocalDateTime.now();
    }

    public Venta(Cliente cliente) {
        this();
        this.cliente = cliente;
    }
}
