package br.edu.fa7.tecnicas.jsf.entity;

public class CartaoDebito {

	String banco;
	Integer agencia;
	Integer conta;
	
	public CartaoDebito() {}
	
	public CartaoDebito( String banco, Integer agencia, Integer conta ) {
		this.banco = banco;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	
	public Integer getConta() {
		return conta;
	}
	
	public void setConta(Integer conta) {
		this.conta = conta;
	}
}
