package org.indra.repository;

import java.util.*;

import org.indra.models.Pelicula;

public class PeliculaMockRepository  implements IPeliculaRepository{
	
	private List<Pelicula> peliculas = new ArrayList<Pelicula>();

	@Override
	public List<Pelicula> findAll() throws Exception {
		return this.peliculas;
	}

	@Override
	public Pelicula findById(int id) throws Exception {

		return this.peliculas.stream().filter( p -> p.getId() == id).findFirst().get();
	}

	@Override
	public Pelicula findByName(String nombre) throws Exception {

		return this.peliculas.stream().filter( p -> p.getTitulo().equals(nombre)).findFirst().get();
	}

	@Override
	public void add(Pelicula pelicula) throws Exception {

		this.peliculas.add(pelicula);
		pelicula.setId(this.peliculas.stream().mapToInt( p -> p.getId()).max().getAsInt() + 1);
	}

	@Override
	public void delete(int id) throws Exception {

		int index = this.peliculas.indexOf(this.peliculas.stream().filter( p -> p.getId() == id).findFirst().get());
		this.peliculas.remove(index);
		
		//Pelicula p = this.peliculas.stream().filter( p -> p.getId() == id).findFirst().get();
		//this.peliculas.remove(p);
	}

	@Override
	public void update(Pelicula pelicula) throws Exception {
		this.delete(pelicula.getId());
		this.add(pelicula);
	}
	
	

}
