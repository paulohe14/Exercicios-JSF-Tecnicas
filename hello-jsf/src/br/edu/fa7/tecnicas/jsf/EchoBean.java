package br.edu.fa7.tecnicas.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EchoBean {

	private String message;
	
	public enum nextStep {success, fail};
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public nextStep doIt() {
		nextStep next = nextStep.fail;
		
		int n = (int) (Math.random() * 10);
		
		
		if(n % 2 == 0) {
			next = nextStep.success;
		}
		
		return next;
	}
}
