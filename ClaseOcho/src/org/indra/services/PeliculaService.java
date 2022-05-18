package org.indra.services;

import org.indra.models.Pelicula;
import org.indra.repository.IPeliculaRepository;
import org.indra.repository.PeliculaRepositoryFactory;

public class PeliculaService {
	
	public void add(Pelicula pelicula) throws Exception {
		IPeliculaRepository repo = PeliculaRepositoryFactory.getInstance().createRepository();
		repo.add(new Pelicula());
	}

}
