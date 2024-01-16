package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void guardar(CuentaBancaria bancaria) {
		this.bancariaRepository.insertar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		this.bancariaRepository.actualizar(bancaria);
		
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		return this.bancariaRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.bancariaRepository.borrar(id);
		
	}

}
