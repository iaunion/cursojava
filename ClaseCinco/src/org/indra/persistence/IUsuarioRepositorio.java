package org.indra.persistence;

import java.util.*;

import org.indra.model.Usuario;

public interface IUsuarioRepositorio {
	
	public Usuario buscarPorNombre (String nombre);
	public List<Usuario> buscarTodos();
	public void add (Usuario usuario);

}
