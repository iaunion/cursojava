package org.indra.claseQuince.controllers;

import org.indra.claseQuince.models.Cancion;
import org.indra.claseQuince.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CancionController extends BaseController {
	
	@Autowired
	private ICancionService cancionService;
	
	@PostMapping("/api/cancion")
	public Object nuevaCancion(Cancion cancion) {
		try {
			cancionService.add(cancion);
			return "OK";
		}catch (Exception exception) {
			return exception.getMessage();
		}
	}
}
