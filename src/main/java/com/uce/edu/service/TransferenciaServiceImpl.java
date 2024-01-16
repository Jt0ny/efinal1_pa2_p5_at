package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void guardar(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		
	CuentaBancaria cuentaOrigen=this.bancariaRepository.seleccionarPorNumero(ctaOrigen);
	CuentaBancaria cuentaDestino=this.bancariaRepository.seleccionarPorNumero(ctaDestino);
	
	Transferencia transferencia= new Transferencia();
	transferencia.setMonto(monto);
	transferencia.setFechaTransferencia(LocalDate.now());
	transferencia.setRefCtaDestino(ctaDestino);
	transferencia.setRefCtaOrigen(ctaOrigen);
	transferencia.setComision(monto.multiply(new BigDecimal(0.1)));
	cuentaOrigen.getSaldo().subtract(monto);
	cuentaDestino.getSaldo().add(monto);
	this.bancariaRepository.actualizar(cuentaDestino);
	this.bancariaRepository.actualizar(cuentaOrigen);
	
	transferencia.setCuentaBancaria(cuentaOrigen);
	this.iTransferenciaRepository.insertar(transferencia);
	
		
		
	}
	@Override
	public List<Transferencia> buscarTodos() {
		return this.iTransferenciaRepository.seleccionarTodos();
	}
	
	
}
