package com.coderhouse.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	@Column(unique = true, nullable = false)
	private String dni;
	
	@ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
	private List<Producto> productos = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, String dni) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Producto> getProducto() {
		return this.productos;
	}

	public void setProducto(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", productos="
				+ productos + "]";
	}
	
}
