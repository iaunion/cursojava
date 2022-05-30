package org.indra.claseQuince.services;

import org.indra.claseQuince.models.Cancion;
import org.indra.claseQuince.models.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class CancionService implements ICancionService{

	@Override
	public void add(Cancion cancion) throws ValidationException {
		cancion.setId(1);
		if (cancion.getNombre().length()<3) {
			 throw new ValidationException("Nombre muy corto");
		}
		
	}

	
}
