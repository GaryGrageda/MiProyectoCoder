package com.coderhouse.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "Facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "id_cliente")
	private int idCliente;
	
	private LocalDateTime fecha;
	
	private double total;
	
	
	
	public Factura() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCliente_id() {
		return this.idCliente;
	}

	public void setCliente_id(int idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDateTime getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", idCliente=" + idCliente + ", fecha=" + fecha + ", total=" + total + "]";
	}
	
	
}
