package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

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
		
		Pelicula pRecuperada = service.getByName("El señor de los anillos");
		assertEquals("El señor de los anillos", pRecuperada.getTitulo());
		assertEquals(260, pRecuperada.getDuracion());
		assertEquals("Peter Jackson", pRecuperada.getDirector());
		assertEquals(LocalDate.now(), pRecuperada.getFechaSalida());
	}
	
	@Test
	void testUpdatePelicula() throws Exception {
		
		PeliculaService service = new PeliculaService();
		Pelicula p = service.getById(1);
		p.setTitulo("Alicia en el pais de las maravillas");
		p.setDuracion(100);
		service.update(p);
	
		Pelicula pRecuperada = service.getById(1);
		assertEquals("Alicia en el pais de las maravillas", pRecuperada.getTitulo());
		assertEquals(100, pRecuperada.getDuracion());
	}
	
	@Test
	void testDeletePelicula() throws Exception {
		
		PeliculaService service = new PeliculaService();
        int numeroPeliculasAntes = service.getAll().size();
        service.delete(2);
        int numeroPeliculasDespues = service.getAll().size();
        assertEquals(numeroPeliculasAntes - 1, numeroPeliculasDespues);
	}

}
