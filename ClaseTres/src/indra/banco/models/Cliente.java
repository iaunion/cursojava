package indra.banco.models;

import java.time.LocalDate;

public class Cliente extends Entidad {
	
//	public String nombre;
	public String apellido;
	public LocalDate fechaNacimiento;
	
	
	/*public void setNombre(String nombre) {
		this.nombre = nombre;
	}*/
	
	public String getApellido() {
		return apellido;
	}
	
	/*public void setApellido(String apellido) {
		this.apellido = apellido;
	}*/
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/*public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}*/
	
	public Cliente (String nombre, String apellido, LocalDate fechaNacimiento) {
		super(nombre);
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString () {
		return String.format("Hola soy %s %s y naci el %s", this.getNombre(), apellido, fechaNacimiento);
	}
	

}
 