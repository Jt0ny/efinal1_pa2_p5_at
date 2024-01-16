package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq_cuenta_bancaria" )
	@SequenceGenerator(name = "seq_cuenta_bancaria",sequenceName = "seq_cuenta_bancaria",allocationSize = 1)
	@Column(name="ctab_id")
	private Integer id;
	
	@Column(name="ctab_numero")
	private String numero;
	
	@Column(name="ctab_tipo")
	private String tipo;
	
	@Column(name="ctab_saldo")
	private BigDecimal saldo;

	@OneToMany(mappedBy = "cuentaBancaria",cascade = CascadeType.ALL)
	private List<Transferencia> transferencias;
	
	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	
	
}
