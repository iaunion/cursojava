/**
 * 
 */
package org.indra.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.*;

import org.indra.ejercicios.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * @author iaunion
 *
 */
class DemoTest {

	@Test
	void testContador() {
		ContadorPalabras contador = new ContadorPalabras("la casa de la esquina");
		assertEquals(2,contador.getOcurrencias("la"));
	}
	
	@Test
	void testFilter() {
		List<String> lista = Arrays.asList("Hola","Chao","MasLarga");
		long masLargasQueCinco = lista.stream().filter(p -> p.length()>5).count();
		assertEquals(1,masLargasQueCinco);
	}
	
	@Test
	void testMap() {
		List<String> lista = Arrays.asList("hola","chao","adios");
		List<String> mayuscula = lista.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		assertEquals("HOLA",mayuscula.get(0));
	}
	
	@Test
	void testSum() {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		int sumatorio = numeros.stream().reduce(0, (acum,actual) -> acum+actual);
		assertEquals(15,sumatorio);
	}
	
	@Test
	void testContiene() {
		List<String> lista = Arrays.asList("hola","chao","adios", "Esteban");
		boolean contiene = lista.stream().anyMatch(p -> p.equals("Esteban"));
		assertEquals(true,contiene);
	}
	
	@Test
	@Order(1)
	void testFileExists() throws IOException {
		File archivo = new File("nombres.txt");
		archivo.createNewFile();
		FileWriter writer = new FileWriter("nombres.txt");
		writer.write("Irene\nErnesto\nRaquel\nDaniel\nMiguel\nCarlos");
		writer.close();
		assertEquals(true, archivo.exists());
	}

	@Test
	@Order(2)
	void testReadFile() throws IOException {
		File archivo = new File("nombres.txt");
		long n = Files.lines(archivo.toPath()).filter(p -> p.length()>4).count();
		assertEquals(6, n);
	}
	
	
}
