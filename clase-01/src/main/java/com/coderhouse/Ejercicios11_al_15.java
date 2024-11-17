package com.coderhouse;

public class Ejercicios11_al_15 {

	public static void main(String[] args) {
		// Ejercicio11
		// Realizar una suma de dos números enteros y mostrar el resultado.
		int num1 = 2;
		int num2 = 5;
		System.out.println("11 - La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
		
		// Ejercicio12
		// Restar dos números de tipo double y mostrar el resultado.
		double dnum1 = 22.6d;
		double dnum2 = 44.2d;
		System.out.println("12 - La resta de " + dnum1 + " y " + dnum2 + " es: " + (dnum1 - dnum2));
		
		// Ejercicio13
		// Multiplicar dos números y mostrar el resultado en pantalla.
		int v_mult1 = 10;
		int v_mult2 = 45;
		System.out.println("13 - La multiplicacion de " + v_mult1 + " y " + v_mult2 + " es: " + (v_mult1 * v_mult2));
		
		// Ejercicio14
		// Dividir dos números y manejar la excepción de división por cero.
		int numDiv1 = 5;
		int numDiv2 = 0;
		
		try {
			System.out.println("14 - La divicion de " + numDiv1 + " y " + numDiv2 + " es: " + (numDiv1 / numDiv2));
		}catch (ArithmeticException e){
			System.out.println("14 - No se pudo realizar la divicion, Error: " + e.getMessage());
		}
		
		// Ejercicio15
		// Usar el operador % para encontrar el residuo de una división.
		double resDiv1 = 789.78d;
		int resDiv2 = 45;
		System.out.println("15 - El resto de " + resDiv1 + " y " + resDiv2 + " es: " + (resDiv1 / resDiv2));
	}

}
