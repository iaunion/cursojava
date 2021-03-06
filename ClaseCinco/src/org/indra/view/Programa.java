package org.indra.view;

import java.util.*;

import org.indra.dto.*;
import org.indra.model.*;
import org.indra.persistence.*;
import org.indra.services.*;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a Indragram");
		
		IUsuarioRepositorio repo = new UsuarioRepositorioDb();
		
		Usuario nuevo = new Usuario ("Pedro");
		repo.add(nuevo);
		
		List<Usuario> todos = repo.buscarTodos();
		todos.forEach( usr -> System.out.println(usr.getNombre()) );
		
		/*
		UsuarioRepositorioMock repo = new UsuarioRepositorioMock();
		UsuarioService usuarioService = new UsuarioService(repo);
		
		System.out.println("Voy a probar a registrar un usuario nuevo");
		
		RegistroUsuarioDTO registro = new RegistroUsuarioDTO();
		registro.setNombreDeseado("Irene");
		
		try {
			usuarioService.registrarUsuarioNuevo(registro);
		} catch (Exception e) {
			System.err.println("Esto no deberia pasar");
		}
		
		System.out.println("Usuario registrado satisfactoriamente");
		
		System.out.println("Voy a probar a registrar un usuario duplicado");
		
		RegistroUsuarioDTO duplicado = new RegistroUsuarioDTO();
		duplicado.setNombreDeseado("Irene");
		
		try {
			usuarioService.registrarUsuarioNuevo(duplicado);
		} catch (Exception e) {
			System.out.println("Deberia dar un error de usuario duplicado");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Voy a probar a registrar un usuario vacio");
		
		RegistroUsuarioDTO vacio = new RegistroUsuarioDTO();
		vacio.setNombreDeseado("");
		
		try {
			usuarioService.registrarUsuarioNuevo(vacio);
		} catch (Exception e) {
			System.out.println("Deberia dar un error de usuario vacio o muy corto");
			System.out.println(e.getMessage());
		}
		*/
	}
}
