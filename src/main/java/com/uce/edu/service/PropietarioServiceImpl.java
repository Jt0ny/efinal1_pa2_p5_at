package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void guardar(Propietario propietario) {
		this.iPropietarioRepository.insertar(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.iPropietarioRepository.actualizar(propietario);
		
	}

	@Override
	public Propietario buscar(Integer id) {
		return this.iPropietarioRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.iPropietarioRepository.borrar(id);
		
	}

}
