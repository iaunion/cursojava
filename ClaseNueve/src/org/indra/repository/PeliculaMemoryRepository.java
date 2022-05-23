package org.indra.repository;

import java.util.*;

import org.indra.models.Pelicula;

public class PeliculaMemoryRepository implements IPeliculaRepository{
	
	private List<Pelicula> peliculas = new ArrayList<Pelicula>();

	@Override
	public void add(Pelicula pelicula) {
		this.peliculas.add(pelicula);
		pelicula.setId(this.peliculas.stream().mapToInt( p -> p.getId()).max().getAsInt() + 1);
	}

	@Override
	public Pelicula findById(int id) {
		return (Pelicula) this.peliculas.stream().filter( p -> p.getId() == id).findFirst().get();
	}
	
	

}
