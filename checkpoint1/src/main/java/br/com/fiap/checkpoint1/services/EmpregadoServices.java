package br.com.fiap.checkpoint1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.data.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoRepository;

//service link to repository

@Service
public class EmpregadoServices {
	
	@Autowired
	EmpregadoRepository empregadoRepository;
	
	public List<Empregado> get(){
		return empregadoRepository.findAll();
	}
	
	public Empregado put(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	
	public Empregado post(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	
}







