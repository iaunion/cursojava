package org.indra.main;

import lombok.*;

import java.io.*;

@Builder
@ToString
public class Reloj {
	
	private @NonNull String marca;
	private @NonNull String modelo;
	
	@SneakyThrows
	public void salvar() {
		var nombreArchivo ="reloj.txt";
		@Cleanup FileWriter writer = new FileWriter(nombreArchivo);
		writer.write(this.toString());
	}

}
