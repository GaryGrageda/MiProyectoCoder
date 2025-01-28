package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	private String apellido;
	
	@Column(unique = true, nullable = false)
	private String dni;
	
//	@JsonBackReference
//	@ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
//	private List<Producto> productos = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, String dni) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
}
