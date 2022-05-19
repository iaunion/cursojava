package org.indra.services;

import java.util.List;

import org.indra.models.Pelicula;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaRepositoryFactory;

public class PeliculaService {
	
	IPeliculaRepository repo;
	
	public PeliculaService() throws Exception {
		this.repo = PeliculaRepositoryFactory.getInstance().createRepository();
	}
	
	public void add(Pelicula pelicula) throws Exception {
		this.repo.add(pelicula);
	}
	
	public List<Pelicula> getAll() throws Exception {
		return repo.findAll();
	}
	
	public Pelicula getById(int id) throws Exception {      
        return this.repo.findById(id);       
    }
	
	public Pelicula getByName(String name) throws Exception {
        return this.repo.findByName(name);
    }
	
	public void update(Pelicula pelicula) throws Exception {
		repo.update(pelicula);
	}
	
	public void delete (int id) throws Exception {
		this.repo.delete(id);
	}

}
