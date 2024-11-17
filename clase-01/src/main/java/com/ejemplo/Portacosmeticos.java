package com.ejemplo;
import java.util.ArrayList;

public class Portacosmeticos {
	// Mi array de nombres de portacosmeticos
	ArrayList<String> arrayPortacosmeticos = new ArrayList();
	ArrayList<Float> arrayPrecios = new ArrayList();
	
	// Construyo mi array con nombres de portacosmeticos y por cada indice creado creo su precio aleatoriamente
	public Portacosmeticos() {
		float precioAleatorio;
		int i;
		
        arrayPortacosmeticos.add("Cartuchera");
        arrayPortacosmeticos.add("Cilindro");
        arrayPortacosmeticos.add("Mochila");
        arrayPortacosmeticos.add("Bolso Chico");
        arrayPortacosmeticos.add("Bolso Grande");

        // Generar precios aleatorios para cada nombre
        for(i = 0; i<arrayPortacosmeticos.size(); i++){
            precioAleatorio = (float) (Math.random() * (8000 - 100 + 1) + 100);
            precioAleatorio = Math.round(precioAleatorio * 100) / 100f; // Lo quiero redondear a solo 2 decimales
            arrayPrecios.add(precioAleatorio);
        }
	}
	
	// Muestro lo generado para verlo en consola
    public void mostrarProductos() {
    	int i;
        for(i = 0; i < arrayPortacosmeticos.size(); i++){
            System.out.println(arrayPortacosmeticos.get(i) + ": $" + arrayPrecios.get(i));
        }
    }
}
