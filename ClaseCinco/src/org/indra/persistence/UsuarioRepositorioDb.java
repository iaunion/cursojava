package org.indra.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.indra.model.Usuario;

public class UsuarioRepositorioDb implements IUsuarioRepositorio {

	@Override
	public Usuario buscarPorNombre(String nombre) {

		Connection conn = null;
		Usuario result = null;
		
 		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/iaunion/Downloads/sqlite-tools-win32-x86-3380500/indragram.db");
			Statement sql = conn.createStatement();
			ResultSet qry =sql.executeQuery(String.format("select * from usuario where nombre='%s';", nombre));
			while (qry.next()) {
				Usuario usr = new Usuario (qry.getString("Nombre"));
			}

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
				try {
					if (conn!=null) conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
 		
 		return result;
	}

	@Override
	public List<Usuario> buscarTodos() {
		
		Connection conn = null;
		List<Usuario> result = new ArrayList<Usuario>();
		
 		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/iaunion/Downloads/sqlite-tools-win32-x86-3380500/indragram.db");
			Statement sql = conn.createStatement();
			ResultSet qry =sql.executeQuery("select * from usuario");
			while (qry.next()) {
				Usuario usr = new Usuario (qry.getString("Nombre"));
				result.add(usr);
			}

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
				try {
					if (conn!=null) conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
 		
 		return result;
	}

	@Override
	public void add(Usuario usuario) {
		
		Connection conn = null;
		
 		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/iaunion/Downloads/sqlite-tools-win32-x86-3380500/indragram.db");
			Statement sql = conn.createStatement();
			sql.executeUpdate(String.format("insert into usuario (nombre) values ('%s');", usuario.getNombre()));

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
				try {
					if (conn!=null) conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		
	}

}
