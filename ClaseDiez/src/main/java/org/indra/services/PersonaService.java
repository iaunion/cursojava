package org.indra.services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.indra.models.*;

public class PersonaService implements IPersonaService {
	
	private String connectionString;
	
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add (Persona persona) {
		//TODO
		try {
			Connection connection = DriverManager.getConnection(this.connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
