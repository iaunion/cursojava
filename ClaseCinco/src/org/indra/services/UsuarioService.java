package org.indra.services;

import org.indra.dto.*;
import org.indra.model.*;
import org.indra.persistence.*;

public class UsuarioService {
	
	private IUsuarioRepositorio repo;

	public UsuarioService (IUsuarioRepositorio repo) {
//		this.repo = new UsuarioRepositorio();
		this.repo = repo; //inyección de dependencias por argumento
	}
	
	public Usuario registrarUsuarioNuevo (RegistroUsuarioDTO registro) throws Exception {
		
		if (this.repo.buscarPorNombre(registro.getNombreDeseado()) != null) {
			throw new Exception("Usuario ya existe");
		}
		
		Usuario nuevo = new Usuario(registro.getNombreDeseado());
		nuevo.validar();
		this.repo.add(nuevo);
		
		return nuevo;
	}

}
