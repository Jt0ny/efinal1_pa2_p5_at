package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	
	public void guardar (CuentaBancaria bancaria);
	
	public void actualizar (CuentaBancaria bancaria);
	
	public CuentaBancaria buscar(Integer id);
	
	public void eliminar (Integer id);
	


}
