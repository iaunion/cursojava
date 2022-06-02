package org.indra.Examen.services;

import java.util.List;

import org.indra.Examen.models.Actor;


public interface IActorService {

	public List<Actor> getAll();
	public Actor getById(int id) throws Exception;
	public Actor add(Actor actor) throws Exception;
	public boolean delete(int id) throws Exception;
}
