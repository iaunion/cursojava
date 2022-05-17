package org.indra.ejercicios;

import java.util.*;
import java.util.stream.Stream;

public class ContadorPalabras {
	
	private Dictionary<String, Integer> diccionario = new Hashtable<String, Integer>();
	
	public ContadorPalabras(String cadena) {
		super();
		String [] palabras = cadena.split("\\s");
		Stream<String> stream = Arrays.stream(palabras);
		stream.forEach(c -> {
			if (this.diccionario.get(c)==null) {
				this.diccionario.put(c, 1);
			} else {
				this.diccionario.put(c, this.diccionario.get(c)+1);
			}
		});
	}
	
	public int getOcurrencias (String palabra) {
		if (diccionario.get(palabra)==null)
			return 0;
		else
			return diccionario.get(palabra);
	}

}
