package com.uce.edu;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.repository.modelo.Transferencia;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.ITransferenciaService;

@SpringBootApplication
public class Efinal1Pa2P5AtApplication implements CommandLineRunner{
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		CuentaBancaria bancaria1= new CuentaBancaria();
		bancaria1.setNumero("123");
		bancaria1.setSaldo(new BigDecimal(100));
		bancaria1.setTipo("Ahorros");
		
		Propietario p1= new Propietario();
		p1.setNombre("Anthony");
		p1.setCedula("798");
		p1.setApellido("Tipan");

		this.bancariaService.guardar(bancaria1);
		
		CuentaBancaria bancaria2= new CuentaBancaria();
		bancaria2.setNumero("456");
		bancaria2.setSaldo(new BigDecimal(400));
		bancaria2.setTipo("Ahorros");
		
		Propietario p2= new Propietario();
		p2.setNombre("Juan");
		p2.setCedula("798dsd");
		p2.setApellido("Valla");
		
		this.bancariaService.guardar(bancaria2);
		
		//this.iTransferenciaService.guardar("123", "798",new BigDecimal(10));
		
		
	/*	List<Transferencia>transferencias =this.iTransferenciaService.buscarTodos();
		for(Transferencia transferencia:transferencias) {
			System.out.println(transferencia);
		}*/
		
	}

}
