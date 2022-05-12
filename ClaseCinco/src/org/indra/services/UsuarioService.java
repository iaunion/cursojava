package org.indra.services;

import org.indra.dto.*;
import org.indra.model.*;

public class UsuarioService {
	
	public Usuario registrarUsuarioNuevo (RegistroUsuarioDTO registro) {
		
		Usuario nuevo = new Usuario(registro.getNombreDeseado());
		
		return nuevo;
	}

}
