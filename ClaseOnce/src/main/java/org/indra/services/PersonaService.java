package org.indra.services;

import java.util.List;

import org.indra.models.*;
import org.indra.persistence.*;

public class PersonaService implements IPersonaService {
	
	IPersonaRepository service = new PersonaJdbcRepository();
    
    public void add(Persona persona) {
        try {
			service.add(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	@Override
	public List<Persona> getAll() {
		return null;
	}

	@Override
	public void delete(int id) {
		
	}
    
    

}
