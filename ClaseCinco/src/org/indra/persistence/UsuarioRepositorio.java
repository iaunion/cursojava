package org.indra.persistence;

import org.indra.model.*;
import java.util.*;

public class UsuarioRepositorio {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Usuario buscarPorNombre (String nombre) {
		
		//Simulo que voy a la base de datos
		Usuario result = null;
		for (Usuario actual : usuarios) {
			if (actual.getNombre().equals(nombre))
				result = actual;
		}
		return result;
	}
	
	public void addUsuario (Usuario usuario) {
		//Simulo que guardo en la base de datos
		this.usuarios.add(usuario);
	}

}
