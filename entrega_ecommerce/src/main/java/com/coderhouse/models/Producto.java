package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String descripcion;
	
	private String codigo;
	
	private int stock;
	
	private double precio;
	
	@JsonBackReference
	@ManyToMany(fetch =FetchType.EAGER)
	@JoinTable(
				name ="ventas", 
				joinColumns = @JoinColumn(name= "id_producto"), 
				inverseJoinColumns = @JoinColumn(name = "id_cliente")
			)
	private List<Cliente> clientes = new ArrayList<>();

	public Producto() {
		super();
	}

	public Producto(String descripcion, String codigo, double precio) {
		this();
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.stock = (int) (Math.random() * (50 - 5 + 1) + 5);// Quiero que el stock por ahora sea un valor aleatorio entre 5 y 50
		this.precio = precio;
	}
	
}
