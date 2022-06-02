package org.indra.Examen.controllers;

import java.util.List;


import org.indra.Examen.models.Actor;
import org.indra.Examen.services.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
	
	@Autowired
	private IActorService actorService;
	
	@GetMapping("/api/actor")
	public ResponseEntity<List<Actor>> getAll() {
		return new ResponseEntity<List<Actor>>(this.actorService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/api/actor/{id}")
	public ResponseEntity<Object> getById(@PathVariable(name="id") int id) {
		try {
			return new ResponseEntity<Object>(this.actorService.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/actor")
	public ResponseEntity<Object> add (@RequestBody() Actor actor) {
		try {
			return new ResponseEntity<Object>(this.actorService.add(actor), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/api/actor/{id}")
	public ResponseEntity<Object> delete (@PathVariable() int id) throws Exception {
		
		boolean esEliminado = this.actorService.delete(id);
		
		if (!esEliminado)
			return new ResponseEntity<Object> (HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Object>(id,HttpStatus.OK);
	}

}
