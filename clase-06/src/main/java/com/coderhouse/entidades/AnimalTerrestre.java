package com.coderhouse.entidades;

import com.coderhouse.interfase.SerVivoInterface;

public class AnimalTerrestre implements SerVivoInterface{
    private boolean vivo;

	@Override
	public String toString() {
		return "Animal [vivo=" + vivo + "]";
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}
    
    
    
}
