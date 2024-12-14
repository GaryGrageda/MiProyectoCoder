package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoEcommerce;
import com.coderhouse.entidades.Cliente;
import com.coderhouse.entidades.Producto;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner{
	@Autowired
	private DaoEcommerce daoE; 
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Producto portacosmetico1 = new Producto("Cartuchera","C111",8400.99);
			Producto portacosmetico2 = new Producto("Cilindro","C222",9500.99);
			Producto portacosmetico3 = new Producto("Mochila","M111",25400.99);
			Producto portacosmetico4 = new Producto("Bolso Chico","B111",14800.99);
			Producto portacosmetico5 = new Producto("Bolso Grande","B222",19100.99);
			
			Cliente cli1 = new Cliente("Paula", "Pérez", "42012312");
			Cliente cli2 = new Cliente("Gary", "Grageda", "42559749");
			Cliente cli3 = new Cliente("Marta", "Silva", "45052044");
			Cliente cli4 = new Cliente("Pedro", "López", "43922105");
			Cliente cli5 = new Cliente("Daniel", "Silva", "49520179");
			Cliente cli6 = new Cliente("Lucía", "Torres", "49952931");
			Cliente cli7 = new Cliente("Daniel", "Rojas", "45242853");
			Cliente cli8 = new Cliente("Marta", "Gómez", "47729540");
			Cliente cli9 = new Cliente("María", "Hernández", "42527651");
			Cliente cli10 = new Cliente("Clara", "Gómez", "40423156");
			Cliente cli11 = new Cliente("María", "Rojas", "41999037");
			Cliente cli12 = new Cliente("Lucía", "Ramírez", "40349558");
			Cliente cli13 = new Cliente("Laura", "García", "48859870");
			Cliente cli14 = new Cliente("María", "Hernández", "48161745");
			Cliente cli15 = new Cliente("Daniel", "Ramírez", "41206552");
			
			daoE.persistirProducto(portacosmetico1);
			daoE.persistirProducto(portacosmetico2);
			daoE.persistirProducto(portacosmetico3);
			daoE.persistirProducto(portacosmetico4);
			daoE.persistirProducto(portacosmetico5);
			
			daoE.persistirCliente(cli1);
			daoE.persistirCliente(cli2);
			daoE.persistirCliente(cli3);
			daoE.persistirCliente(cli4);
			daoE.persistirCliente(cli5);
			daoE.persistirCliente(cli6);
			daoE.persistirCliente(cli7);
			daoE.persistirCliente(cli8);
			daoE.persistirCliente(cli9);
			daoE.persistirCliente(cli10);
			daoE.persistirCliente(cli11);
			daoE.persistirCliente(cli12);
			daoE.persistirCliente(cli13);
			daoE.persistirCliente(cli14);
			daoE.persistirCliente(cli15);
		}catch(Exception e){
			e.printStackTrace(System.err);
		}
	}

}
