package com.ejemplo;

public class Ejercicio32 {

    public static void main(String[] args) {
        int numero = 456; // Ejemplo de número
        int cuadrado = calcularCuadrado(numero);
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
    }
    
    // Método estático para calcular el cuadrado de un número
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }
    
    
}
