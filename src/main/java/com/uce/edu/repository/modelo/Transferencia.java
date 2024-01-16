package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="transferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq_transferencia" )
	@SequenceGenerator(name = "seq_transferencia",sequenceName = "seq_transferencia",allocationSize = 1)
	@Column(name="tran_id")
	private Integer id;
	
	@Column(name="tran_fecha_transferencia")
	private LocalDate fechaTransferencia;
	
	@Column(name="tran_ref_cta_origen")
	private String refCtaOrigen;

	@Column(name="tran_ref_cta_destino")
	private String refCtaDestino;
	
	@Column(name="tran_monto")
	private BigDecimal monto;
	
	@Column(name="tran_comision")
	private BigDecimal comision;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tran_id_prop")
	private Propietario propietario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tran_id_ctab")
	private CuentaBancaria cuentaBancaria;
	
	
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fechaTransferencia=" + fechaTransferencia + ", refCtaOrigen="
				+ refCtaOrigen + ", refCtaDestino=" + refCtaDestino + ", monto=" + monto + ", comision=" + comision
				+ "]";
	}

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDate fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getRefCtaOrigen() {
		return refCtaOrigen;
	}

	public void setRefCtaOrigen(String refCtaOrigen) {
		this.refCtaOrigen = refCtaOrigen;
	}

	public String getRefCtaDestino() {
		return refCtaDestino;
	}

	public void setRefCtaDestino(String refCtaDestino) {
		this.refCtaDestino = refCtaDestino;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getComision() {
		return comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	

}
