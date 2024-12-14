package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.entidades.Cliente;
import com.coderhouse.entidades.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoEcommerce {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void persistirCliente(Cliente cliente) {
		em.persist(cliente);
	}

	@Transactional
	public void persistirProducto(Producto producto) {
		em.persist(producto);
	}
	
}
