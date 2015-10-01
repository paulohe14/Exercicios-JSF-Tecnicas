package br.edu.fa7.tecnicas.jsf;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PalpiteBean {

	private Integer numero;
	private Integer tentativas;
	private Integer palpite;
	private String message;
	


	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public Integer getPalpite() {
		return palpite;
	}



	public void setPalpite(Integer palpite) {
		this.palpite = palpite;
	}



	public Integer getTentativas() {
		return tentativas;
	}



	public void setTentativas(Integer tentativas) {
		this.tentativas = tentativas;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String doIt() {
		String next = "Palpite";
		
		if((message != null) && (!message.isEmpty())) {
			next ="echo";
		}
		
		return next;
	}
}
