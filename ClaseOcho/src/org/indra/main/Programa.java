package org.indra.main;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

import org.indra.models.*;
import org.indra.repository.*;
import org.indra.services.*;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		//Modo configuracion (app y dependencias), aqui se define quien depende de quien
		
		//PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
		//PeliculaRepositoryFactory.configureClass(PeliculaDbRepoFactory.class);
		
		
		//Modo ejecucion (tengo todo configurado y ejecuto mi aplicacion normalmente)
		
		/*PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setTitulo("El señor de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaSalida(LocalDate.now());
		service.add(p);*/
		
		/*Set<String> zonas = ZoneId.getAvailableZoneIds(); //Para obtener las zonas horarias
		zonas.stream().forEach(z -> System.out.println(z));*/
		
	}

}
