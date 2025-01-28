package com.coderhouse.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VentaDetalles")
@Data
public class VentaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
    
    @Column(nullable = false)
    private Integer cantidadPedida;

    @Column(nullable = false)
    private Double precioUnitario;

    @Column(nullable = false)
    private Double total;

    // Método auxiliar para calcular el total
    public void calcularTotal() {
        this.total = this.cantidadPedida * this.precioUnitario;
    }
}
