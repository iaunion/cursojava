package org.indra.persistence;

import org.indra.model.*;
import java.util.*;

public class UsuarioRepositorioMock implements IUsuarioRepositorio {
	
	List<Usuario> usuarios = new ArrayList<Usuario>(); {{
		new Usuario ("alice");
		new Usuario ("bob");
		new Usuario ("charles");
	}};
	
	public Usuario buscarPorNombre (String nombre) {
		
		//Simulo que voy a la base de datos
		Usuario result = null;
		for (Usuario actual : usuarios) {
			if (actual.getNombre().equals(nombre))
				result = actual;
		}
		return result;
	}
	
	public void add (Usuario usuario) {
		//Simulo que guardo en la base de datos
		this.usuarios.add(usuario);
	}

	@Override
	public List<Usuario> buscarTodos() {
		
		return this.usuarios;
	}


}
