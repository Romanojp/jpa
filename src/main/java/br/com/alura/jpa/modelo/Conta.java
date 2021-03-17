package br.com.alura.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Conta {
	@Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gerando um id automaticamente
	private Long id;
	private Long agencia;
	private Long numero;
	private String titular;
	private Double saldo;
	

	


	public Long getId() {
		return id;
	}

	public Long getAgencia() {
		return agencia;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAgencia(int agencia) {
		this.agencia =(long)agencia;
	}

	public void setNumero(int i) {
		this.numero = (long) i;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Long getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}