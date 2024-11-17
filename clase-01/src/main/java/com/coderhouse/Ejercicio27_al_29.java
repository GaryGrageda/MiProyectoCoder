package com.coderhouse;
import java.util.ArrayList;

public class Ejercicio27_al_29 {

	public static void main(String[] args) {
		// Ejercicio27
		// Declarar un arreglo de String para almacenar los nombres de los días de la semana.
		String[] diasSemana = new String[7];
		int i;
		
		diasSemana[0] = "Lunes";
		diasSemana[1] = "Martes";
		diasSemana[2] = "Miércoles";
		diasSemana[3] = "Jueves";
		diasSemana[4] = "Viernes";
		diasSemana[5] = "Sabado";
		diasSemana[6] = "Domingo";
		
		System.out.println("27 - Los dias de la semana son:");
		for(i=0; i<diasSemana.length; i++) {
			System.out.println(diasSemana[i]);
		}
		System.out.println("**********************************************************************************");
		// Ejercicio28
		// Definir un ArrayList<Integer> para almacenar las edades de varios estudiantes.
		ArrayList<Integer> arrayEdades = new ArrayList();
		int cantidadEstudiantes = 10;
		
		System.out.println("28 - Las edades de los estudiantes son:");
		for(i=0; i<cantidadEstudiantes; i++) {
			arrayEdades.add((int) (Math.random() * (80 - 18 + 1)) + 18);
			System.out.println("Alumno " + (i+1) + ": " + arrayEdades.get(i));
		}
		System.out.println("**********************************************************************************");
		// Ejercicio29
		//Crear un objeto de la clase Persona y asignar valores a sus variables.
		// Este ejercicio esta en dos partes, en la clase Persona del ejercicio 26 y a continuacion...
		Persona persona1 = new Persona("Gary", 32, 1.75);
		persona1.mostrarInformacion(); // No hace falta el System.out.println por que adentro de mostrarInformacion lo contiene
	}

}
