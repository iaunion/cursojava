package org.indra.services;

import org.indra.models.Pelicula;

public class PeliculaServiceAlternative implements IPeliculaService {
	
	private String mensaje = "Se utiliza el servicio alternativo";

	@Override
	public void add(Pelicula pelicula) {
		System.out.println(this.mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public Pelicula findById(int id) {
		System.out.println("findById del alternativo");
		return null;
	}

	
}
