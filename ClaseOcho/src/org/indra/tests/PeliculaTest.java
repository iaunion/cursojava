package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.indra.models.Pelicula;
import org.indra.repository.PeliculaMockRepoFactory;
import org.indra.repository.PeliculaRepositoryFactory;
import org.indra.services.PeliculaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliculaTest {

	@BeforeEach
	void setUp() throws Exception {
		PeliculaRepositoryFactory.configureClass(PeliculaMockRepoFactory.class);
	}

	@Test
	void testAddPelicula() throws Exception {
		
		PeliculaService service = new PeliculaService();
		Pelicula p = new Pelicula();
		p.setTitulo("El señor de los anillos");
		p.setDirector("Peter Jackson");
		p.setDuracion(260);
		p.setFechaSalida(LocalDate.now());
		service.add(p);
		
		Pelicula pRecuperada = PeliculaRepositoryFactory.getInstance().createRepository().findByName("El señor de los anillos");
		assertEquals(260, pRecuperada.getDuracion());
	}

}
