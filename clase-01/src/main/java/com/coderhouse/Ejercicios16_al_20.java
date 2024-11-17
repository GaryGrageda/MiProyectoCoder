package com.coderhouse;

public class Ejercicios16_al_20 {

	public static void main(String[] args) {
		// Ejercicio16
		// Comparar dos enteros y mostrar si el primero es mayor que el segundo.
		int num1 = 11;
		int num2 = 5;
		
		if(num1 > num2) {
			System.out.println("16 - " + num1 + " es mayor que " + num2);
		}
		
		// Ejercicio17
		// Verificar si un número es par usando el operador %.
		double dnum1 = 22.0d;
		double restoDiv = dnum1 % 2;
		
		if(restoDiv == 0) {
			System.out.println("17 - " + dnum1 + " es par");
		}else {
			System.out.println("17 - " + dnum1 + " es impar, el resto dividido por 2 es: " + restoDiv);
		}
		
		// Ejercicio18
		// Comparar dos String para ver si son iguales.
		String string1 = "Hola Hola";
		String string2 = "Hola Hola";
		
		if(string1 == string2) {
			System.out.println("18 - El string: " + string1 + " y el segundo string: " + string2 + " son iguales");
		}else {
			System.out.println("18 - El string: " + string1 + " y el segundo string: " + string2 + " son distintos");
		}
		
		// Ejercicio19
		// Crear una condición que verifique si un estudiante está aprobado (nota >= 6).
		double nota = 5.99d;
		
		if(nota >= 6) {
			System.out.println("19 - El estudiante aprobó, saco: " + nota);
		}else {
			System.out.println("19 - El estudiante no aprobó, saco: " + nota);
		}
		
		// Ejercicio20
		// Utilizar operadores lógicos para verificar si un número está entre 1 y 10.
		int numero = 0;
		
		if(numero <= 10 && numero >= 1) {
			System.out.println("20 - " + numero + " está entre el 1 y el 10");
		}else {
			System.out.println("20 - " + numero + " no está entre el 1 y el 10");
		}
	}

}
