package br.edu.fa7.tecnicas.jsf.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PalpiteBean {

	private Integer numero;
	private Integer tentativas;
	private Integer palpite;
	private String message = "Tente acertar, informe um número de 1 a 100.";
	
	public PalpiteBean() {
		iniciar();
	}
	
	public void apostar() {
		if( tentativas < 3){
			tentativas ++;
			if( palpite == numero ){
				message = "Acertoooooou \\o/!!";
			}else if( palpite > numero ){
				message = " Informe um numero menor ";
			}else{
				message = " Informe um número maior ";
			}
		}else{
			message = "Acabaram as tentativas! Inicie novamente.";
		}
	}
	
	public void iniciar() {
		tentativas = 0;
		numero = (int) ( Math.random() * 101 );
		message = "Tente acertar, informe um número de 1 a 100.";
		System.out.println("NUMERO: >>>>>" + numero);
	}

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

}
