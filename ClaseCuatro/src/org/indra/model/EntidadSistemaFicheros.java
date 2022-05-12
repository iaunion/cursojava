package org.indra.model;

public abstract class EntidadSistemaFicheros {

	protected static IObserver miradoPor = null;
	
	public static void RegistrarQuienMira (IObserver obs) {
//		EntidadSistemaFicheros.miradoPor = obs;
		miradoPor = obs;
	}
	
	private String nombre = null;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract int calcularTamaño ();
	
}
