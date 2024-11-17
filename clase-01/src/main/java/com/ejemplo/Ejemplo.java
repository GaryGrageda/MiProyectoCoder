package com.ejemplo;
import com.coderhouse.Persona;

// Ejercicio30
// Crear un paquete com.ejemplo y dentro de él una clase llamada Ejemplo.

public class Ejemplo {
	/* Ejercicio 31 */
	// Escribir un programa que use múltiples clases y acceda a sus métodos desde una clase principal.
	
	public static void main(String[] args) {
		Portacosmeticos comercio = new Portacosmeticos(); // Declaro comercio generando mi lista de portacosmeticos con sus precios
		
		// Quiero ver lo que genero
		comercio.mostrarProductos();
	}
}
