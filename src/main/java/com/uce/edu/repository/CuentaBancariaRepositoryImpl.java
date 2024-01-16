package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria bancaria) {
		this.entityManager.persist(bancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public CuentaBancaria seleccionar(Integer id) {
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void borrar(Integer id) {
		CuentaBancaria bancaria=this.seleccionar(id);
		this.entityManager.remove(bancaria);
		
	}

	@Override
	public CuentaBancaria seleccionarPorNumero(String numero) {
		TypedQuery< CuentaBancaria>query=this.entityManager
		.createQuery("select c from CuentaBancaria c where c.numero=:numero ",CuentaBancaria.class);
		query.setParameter("numero", numero);
		return query.getSingleResult();
	}

}
