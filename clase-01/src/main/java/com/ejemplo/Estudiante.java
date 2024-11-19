package com.ejemplo;
import java.time.LocalDate;

public class Estudiante {
	/* Ejercicio 33 
	 * Crear una clase Estudiante con atributos como nombre y nota.
	 * */
	// Los atributos
	String nombre;
	double nota;
	LocalDate fechaIngreso;
	
	public static void main(String[] args) {
		
	}

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.fechaIngreso = LocalDate.now();
    }
    
    public String mostrarDatos() {
    	String mensaje = "Nombre: " + this.nombre + " - " + "Nota: " + this.nota + " - " + "Fecha de Ingreso: " + this.fechaIngreso;
    	return mensaje;
    }
}
