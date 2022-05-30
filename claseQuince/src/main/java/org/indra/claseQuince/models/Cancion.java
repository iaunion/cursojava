package org.indra.claseQuince.models;

import lombok.*;

@Setter
@Getter
public class Cancion extends ObjetoDeNegocio{
	private String nombre;
	private String artista;
	private int duracionSegundos;
}
