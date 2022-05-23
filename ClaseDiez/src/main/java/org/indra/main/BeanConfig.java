package org.indra.main;

import java.util.*;

import org.indra.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@SuppressWarnings("serial")
	@Bean
	public IGeografiaService geografiaService() {
		GeografiaService service = new GeografiaService();
		service.setComunidadesAutonomas(new ArrayList<String>() {{
			add("Madrid");
			add("Andalucia");
			add("Cantabria");
			add("Asturias");
			add("Galicia");
		}});
		
		service.setProvincias(new HashMap<String, String>() {{
			put("Madrid","Madrid");
			put("Andalucia","Sevilla,Huelva,Cadiz,Malaga");
			put("Cantabria", "Santander");
			put("Asturias","Asturias");
			put("Galicia","Lugo");
		}});

		
		return service;
	}
	
	@Bean
	public IPersonaService personaService() {
		return new PersonaService() {{
			setConnectionString("\"jdbc:sqlite:C:/Users/iaunion/Downloads/sqlite-tools-win32-x86-3380500/personas.db\"");
		}};
	}

}
