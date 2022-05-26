package org.indra.ClaseCatorce.controllers;

import java.util.*;

import org.indra.ClaseCatorce.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpleadoController {
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public EmpleadoController() {
		empleados.add(new Empleado(1, "Ernesto", "Martinez"));
		empleados.add(new Empleado(2, "Raquel", "Riello"));
		empleados.add(new Empleado(3, "Miguel", "Montejano"));
		empleados.add(new Empleado(4, "Irene", "Aunion"));
	}
	
	@RequestMapping("/api/empleados")
	public List<Empleado> getAll() {
		return empleados;
	}
	
	@RequestMapping("/api/empleado/{id}")
	public Empleado getById(@PathVariable(name="id") int id) {
		return empleados.stream().filter(e -> e.getId() == id).findFirst().get();
	}
	
	@RequestMapping("/api/empleado/echo")
	public Empleado echoEmpleado(Empleado empleado) {
		//Ejemplo invocacion: http://localhost:8080/api/empleado/echo?id=1&nombre=Irene&apellido=Aunion
		return empleado;
	}
	
	@PostMapping("/api/empleado/add")
	public Empleado addEmpleado(@RequestBody Empleado empleado) {
		empleado.setId(empleados.size()+1);
		return empleado;
	}

}
