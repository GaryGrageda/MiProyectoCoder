package com.coderhouse.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Facturas_detalles")
public class FacturaDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "id_factura")
	private int idFactura;
	
	private int cantidad;
	
	@Column(name = "id_producto")
	private int idProducto;
	
	private double precio;

	public FacturaDetalle() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [id=" + id + ", idFactura=" + idFactura + ", cantidad=" + cantidad + ", idProducto="
				+ idProducto + ", precio=" + precio + "]";
	}
	
	
}
