package org.indra.model;

public class Comentario extends ObjetoDeNegocio {
	
	private String texto;
	private Usuario autor;
	
	public Comentario(String texto, Usuario autor) {
		super();
		this.texto = texto;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public Usuario getAutor() {
		return autor;
	}

	
	
	

}
