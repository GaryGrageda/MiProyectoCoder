package com.ejemplo;
import java.util.Scanner;

public class Ejercicio35 {
	// Ejercicio 35
	// Crear un programa que determine si un número es primo utilizando operadores relacionales y bucles.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean esPrimo = true; // Asumir que el número es primo
        int i;
        // Solicito el numero para evaluar
	    System.out.println("Ingrese un número para evaluar si es primo:");
	    int numero = scanner.nextInt();

        // Verificar si el número es menor o igual a 1 (no es primo)
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Verificar divisores desde 2 hasta la raíz cuadrada del número
            for(i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Si se encuentra un divisor, no es primo
                    break;
                }
            }
        }

        // Mostrar el resultado
        if(esPrimo){
            System.out.println("El número " + numero + " es primo.");
        }else{
            System.out.println("El número " + numero + " no es primo.");
        }
	}

}
