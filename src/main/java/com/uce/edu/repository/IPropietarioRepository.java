package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {

	
	public void insertar (Propietario propietario);
	
	public void actualizar (Propietario propietario);
	
	public Propietario seleccionar(Integer id);
	
	public void borrar (Integer id);
	
}
