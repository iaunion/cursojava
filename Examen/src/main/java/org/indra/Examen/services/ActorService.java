package org.indra.Examen.services;

import java.util.List;

import org.indra.Examen.models.Actor;
import org.indra.Examen.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService implements IActorService {
	
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public List<Actor> getAll() {
		return this.actorRepository.findAll();
	}

	@Override
	public Actor getById(int id) throws Exception {
		return this.actorRepository.findById(id).get();
	}

	@Override
	public Actor add(Actor actor) throws Exception {

		if ((actor.getNombre()==null) || (actor.getNombre().length()==0))
			throw new Exception("Falta el nombre del actor");
		
		if ((actor.getApellido()==null) || (actor.getApellido().length()==0))
			throw new Exception("Falta el apellido del actor");
		
		this.actorRepository.save(actor);
		return actor;
	}

	@Override
	public boolean delete(int id) throws Exception {
		
		this.actorRepository.deleteById(id);
		
		if (this.actorRepository.findById(id)==null)
			return true;
		else
			return false;
	}
	

}
