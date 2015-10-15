package br.edu.fa7.tecnicas.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoBean {

	private boolean editable;
	
	public List<Produto> getProdutosDisponiveis() {
		List<Produto> result = new ArrayList<Produto>();

		result.add(new Produto("Pincel", "Material Escolar", 5.9));
		result.add(new Produto("Caderno", "Material Casa", 3.9));
		result.add(new Produto("Caneta", "Material Escritorio", 1.9));

		return result;
	}
	
	public void execute() {
		setEditable(!isEditable());
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	
}
