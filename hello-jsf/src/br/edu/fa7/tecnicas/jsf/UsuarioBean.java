package br.edu.fa7.tecnicas.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {

	
	private String username;
	private String password;
	private String perfil;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
}
