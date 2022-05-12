package org.indra.persistence;

import org.indra.model.Usuario;

public interface IUsuarioRepositorio {
	
	public Usuario buscarPorNombre (String nombre);
	public void add (Usuario usuario);

}
