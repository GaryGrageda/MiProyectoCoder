package com.ejemplo;
import java.time.LocalDate;
import java.time.Period;

public class Empleados {
	String nombre;
	int edad;
	char sexo;
	double sueldoBase;
	double sueldoConIncremento;
	LocalDate fechaIngreso;
	LocalDate fechaActual;
	
	// El constructor
	public Empleados(String nombre, int edad, char sexo, LocalDate fechaIngreso){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaIngreso = fechaIngreso;
		this.sueldoBase = 1000000.00d; // Inicializamos con un millón
		this.fechaActual = LocalDate.now(); // Inicializo ocn la fecha de hoy
	}
	
	// Método para calcular el sueldo con el incremento por antigüedad (anual)
	public double calcularSueldoConAntiguedad() {
		Period antiguedad = Period.between(fechaIngreso, fechaActual);
		int años = antiguedad.getYears(); // Obtener años de antigüedad
		
		this.sueldoConIncremento = sueldoBase * (1 + (0.1 * años));// Quiero incrementar un 10% por cada año de antigüedad
		
		return this.sueldoConIncremento;
	}
	
    // Getters
    public String getSexo() {
    	// Este get tiene la particularidad de que si es M retorna la palabra Hombre, si no retorna Mujer
    	if(this.sexo == 'M') {
    		return "Hombre";
    	}else {
    		return "Mujer";
    	}
    }
	
    public String getNombre() {
    	return this.nombre;
    }
    
    public int getEdad() {
    	return this.edad;
    }
    
    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }

    public double getSueldoBase() {
        return this.sueldoBase;
    }
}
