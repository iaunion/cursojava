package org.indra.services;

import org.indra.dto.*;
import org.indra.model.*;
import org.indra.persistence.*;

public class UsuarioService {
	
	private UsuarioRepositorio repo;

	public UsuarioService () {
		this.repo = new UsuarioRepositorio();
	}
	
	public Usuario registrarUsuarioNuevo (RegistroUsuarioDTO registro) throws Exception {
		
		if (this.repo.buscarPorNombre(registro.getNombreDeseado()) != null) {
			throw new Exception("Usuario ya existe");
		}
		
		Usuario nuevo = new Usuario(registro.getNombreDeseado());
		nuevo.validar();
		this.repo.addUsuario(nuevo);
		
		return nuevo;
	}

}
