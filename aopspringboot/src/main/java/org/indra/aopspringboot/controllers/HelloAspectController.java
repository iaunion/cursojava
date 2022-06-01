package org.indra.aopspringboot.controllers;

import org.indra.aopspringboot.services.HelloAspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAspectController {
	
	@Autowired
	private HelloAspectService service;
	
	@GetMapping("/api/hello")
	public String hello () {
		return this.service.hello();
	}

}
