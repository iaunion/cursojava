package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

class JavaClassesTests {

	@Test
	void testArrayList() {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Esteban");
		lista.add("Carlos");
		lista.add("Irene");
		assertEquals(3,lista.size());
		
	}
	
	@Test
	void testLinkedList() {
		
		List<String> lista = new LinkedList<String>();
		lista.add("Esteban");
		lista.add("Carlos");
		lista.add("Irene");
		assertEquals(3,lista.size());
		
	}
	
	@Test
	void testQueue() {
		Queue<String> cola = new LinkedList<String>();
		cola.add("Uno");
		cola.add("Dos");
		cola.add("Tres");
		String elem = cola.remove();
		assertEquals("Uno",elem);
	}
	
	@Test
	void testStack() {
		Stack<String> pila = new Stack<String>();
		pila.add("Uno");
		pila.add("Dos");
		pila.add("Tres");
		String elem = pila.pop();
		assertEquals("Tres",elem);
	}

}
