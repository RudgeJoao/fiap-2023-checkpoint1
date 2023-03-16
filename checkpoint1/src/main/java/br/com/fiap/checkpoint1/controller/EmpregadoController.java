package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.data.Empregado;
import br.com.fiap.checkpoint1.services.EmpregadoServices;

@RestController
@RequestMapping("/empregado")
public class EmpregadoController {

	@Autowired
	EmpregadoServices empregadoServices;

	@GetMapping
	public List<Empregado> get() {
		return empregadoServices.get();
	}

	@PutMapping
	public Empregado put(Empregado empregado) {
		return empregadoServices.put(empregado);
	}

	@PostMapping
	public Empregado post(Empregado empregado) {
		return empregadoServices.post(empregado);
	}

}
