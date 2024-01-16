package com.uce.edu.service;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void guardar (String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public List<Transferencia> buscarTodos();

}
