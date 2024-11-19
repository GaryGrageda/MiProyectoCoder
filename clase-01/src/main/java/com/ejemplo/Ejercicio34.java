package com.ejemplo;
import java.util.Scanner;

public class Ejercicio34 {
	// Ejercicio 34
	// Escribir un programa que calcule el área de un círculo usando una constante para PI.
	
    public static void main(String[] args) {
    	double PI = 3.141592653589793;
        Scanner scanner = new Scanner(System.in);
    	System.out.println("Por favor, ingresa el radio del círculo."); // Pido valor
        System.out.print("Radio: ");
        double radio = scanner.nextDouble();

        // Calcular el área
        double area = PI * Math.pow(radio, 2); // Fórmula: PI * radio^2

        System.out.println("El área del círculo es: " + area);
    }
}
