package org.indra.main;

public class Program {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		
		auto.setId(1);
		//auto.setMarca("Lamborghini");
		//auto.setModelo("Murcielago");
		auto.setKilometros(0);
		
		System.out.println(auto);
		
		Reloj reloj = Reloj.builder().marca("Casio").modelo("XRS100").build();
		System.out.println(reloj);
		
		reloj.salvar();
		
		Persona persona = new Persona ("Juan","Perez");		
		System.out.println(persona);
	}

}
