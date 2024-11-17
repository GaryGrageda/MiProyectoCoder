package com.coderhouse;

public class Persona {
	// Ejercicio29
	// Las variables que usaré para luego mostrar por consola.
    String nombre;
    int edad;
    double altura;
    
    
	// Ejercicio26
	// Crear una clase Persona que tenga variables primitivas como edad y altura.
	
	public static void main(String[] args) {
		byte edad = 127;
		double alturaCmt = 175.0d;
		
		System.out.println("26 - Esta clase persona tiene la edad de: " + edad + " y altura de: " + alturaCmt);
	}
	
	/* Ejercicio29 */
	// El constructor que se usa para asignar las variables
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    // El metodo que arma el string con toda esta info
    public void mostrarInformacion() {
    	System.out.println("29 - Esta clase persona tiene nombre: " + nombre + " Edad: " + edad + " y una altura de: " + altura + "mtr");
    }
}
