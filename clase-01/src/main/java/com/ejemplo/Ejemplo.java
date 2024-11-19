package com.ejemplo;
import java.time.LocalDate;
import java.util.ArrayList;

// Ejercicio30
// Crear un paquete com.ejemplo y dentro de él una clase llamada Ejemplo.

public class Ejemplo {
	/* Ejercicio 31 */
	// Escribir un programa que use múltiples clases y acceda a sus métodos desde una clase principal.
	
	public static void main(String[] args) {
		Portacosmeticos comercio = new Portacosmeticos(); // Declaro comercio generando mi lista de portacosmeticos con sus precios
		
		// Declaro un par de empleados
		Empleados yo = new Empleados("Gary", 32, 'M', LocalDate.of(2018, 9, 13)); // Tuve que convertir el parametro y variable edad a int
		Empleados gabriel = new Empleados("Gabriel", 54, 'M', LocalDate.of(2001, 9, 13));
		Empleados nicolas = new Empleados("Nicolas", 23, 'M', LocalDate.of(2022, 10, 13));
		Empleados pablo = new Empleados("Pablo", 39, 'M', LocalDate.of(2023, 1, 13));
		Empleados melina = new Empleados("Melina", 39, 'F', LocalDate.of(2022, 5, 13));
		ArrayList<Empleados> misEmpleados = new ArrayList(); // Voy a guardar todos mis empleados generados mas arriba en una lista
		double sueldo; // Variable en la que voy a guardar el sueldo segun antiguedad
		boolean muestroSeparador = false;
		int i;
		
		// Los agrego para mostrarlos uno por uno de forma dinamica
		misEmpleados.add(yo);
		misEmpleados.add(gabriel);
		misEmpleados.add(nicolas);
		misEmpleados.add(pablo);
		misEmpleados.add(melina);
		
		System.out.println("Bienvenidos a GaryCuer!!! mi local tiene por el momento estos artículos con sus precios...:");
		// Quiero ver lo que genero
		comercio.mostrarProductos();
		System.out.println("***********************************************************************");
		System.out.println("Ahora les muestro los empleados que trabajan en la fábrica...:");

		for(i=0; i<misEmpleados.size(); i++) {
			if(muestroSeparador) {
				System.out.println("----------------------------------------");
			}
			
			muestroSeparador = true;
			
			sueldo = Math.round(misEmpleados.get(i).calcularSueldoConAntiguedad() * 100) / 100d; // Lo redondeo a 2 decimales
			System.out.println("Empleado: "+misEmpleados.get(i).getNombre());
			System.out.println("Edad: "+misEmpleados.get(i).getEdad());
			System.out.println("Sexo: "+misEmpleados.get(i).getSexo());
			System.out.println("Sueldo: "+sueldo);
		}
	}
	/* FIN Ejercicio 31 */
}
