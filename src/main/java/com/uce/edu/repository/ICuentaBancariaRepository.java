package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	public void insertar (CuentaBancaria bancaria);
	
	public void actualizar (CuentaBancaria bancaria);
	
	public CuentaBancaria seleccionar(Integer id);
	
	public void borrar (Integer id);
	
	public CuentaBancaria seleccionarPorNumero(String numero);

}
