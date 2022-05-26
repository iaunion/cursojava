package org.indra.ClaseCatorce.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundoController {
	
	@RequestMapping(value = "/api/HolaMundo", method = RequestMethod.GET)
	public String MiPrimeraAccion() {
		return "Hola Mundo Rest";
	}
	
	@RequestMapping(value = "/api/Saludo/{nombre}", method = RequestMethod.GET)
	public String Saludar(@PathVariable("nombre") String nombre) {
		return "Hola " + nombre;
	}
	
	@RequestMapping(value = "/api/SaludoConQuery", method = RequestMethod.GET)
	public String SaludarConQuery(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido) {
		return "<h1>"+"Hola " + nombre + " " + apellido+"</h1>";
	}
	
	@RequestMapping(value = "/api/SaludoOpcional", method = RequestMethod.GET)
	public String SaludarOpcional(@RequestParam(name = "nombre", required = false) String nombre) {
		if (nombre==null)
			return "Hola, ¿como te llamas?";
		
		return "Hola " + nombre;
	}
	
	@GetMapping("api/OtroSaludo")
	public String OtroSaludoMas(@RequestParam() String nombre) {
		return "Hola te saludo de nuevo " + nombre;
	}
	
	@GetMapping("api/OtroSaludoOpcional")
	public String OtroSaludoOpcional(Optional<String> nombreOpcional) {
		//return "Hola " + nombreOpcional.orElse("Sin Nombre");
		return "Hola " + nombreOpcional.orElseGet(() -> "Sin Nombre");
	}
	
	@GetMapping("api/SaludoPorDefecto")
	public String SaludoPorDefecto(@RequestParam(defaultValue="Sin Nombre") String nombre) {
		return String.format("<h1>Hola %s</h1>", nombre);
	}
	
	@RequestMapping(value = "/api/Sumar", method = RequestMethod.GET)
	public int Sumar(@RequestParam("num1") int a, @RequestParam("num2") int b) {
		return a+b;
	}
	
	@GetMapping("/api/ListarQuery")
	public String ListarQueryString(@RequestParam() Map<String, String> query) {
		//Ejemplo de invocacion: http://localhost:8080/api/ListarQuery?a=1&b=2&nombre=Irene&apellido=Aunion
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>");
		sb.append("<li>Mis Query String son:</li>");
		query.keySet().forEach(key -> {sb.append("<li>"+key + ":" + query.get(key)+"</li>");});
		sb.append("</ul>");
		return sb.toString();
	}
	
	@GetMapping("/api/MultiParam")
	public String ParametrosMultiples(@RequestParam(name="p") List<String> params) {
		//Ejemplo de invocacion: http://localhost:8080/api/MultiParam?p=1&p=2&p=Irene&p=Aunion
		//Ejemplo de invocacion: http://localhost:8080/api/MultiParam?p=1,2,3,4
		StringBuilder sb = new StringBuilder();
		sb.append("<ol>");
		params.forEach(param -> {sb.append("<li>"+param+"</li>");});
		sb.append("</ol>");
		return sb.toString();
	}

}
