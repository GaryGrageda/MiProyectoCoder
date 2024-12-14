package com.coderhouse.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descripcion;
	
	private String codigo;
	
	private int stock;
	
	private double precio;
	
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
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + ", stock=" + stock
				+ ", precio=" + precio + ", clientes=" + clientes + "]";
	}
	
	
}
