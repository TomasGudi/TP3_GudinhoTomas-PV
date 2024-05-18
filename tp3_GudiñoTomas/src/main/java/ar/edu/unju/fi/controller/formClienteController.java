package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formClienteController {
	
	@GetMapping("/formulario")
	public String getformCliente() {
		return "formCliente";
	} 
}
