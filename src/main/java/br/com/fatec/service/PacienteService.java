package br.com.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.entities.Paciente;
import br.com.fatec.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	// GET - Lista todos os pacientes
	public List<Paciente> findAll(){
		return pacienteRepository.findAll();
	}
	
	// GET BY ID - Lista por id
	public Paciente findById(Long id) {
		return pacienteRepository.findById(id).get();
	}
	
	// POST
	public Paciente salvar(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	// PUT
	public Paciente atualiza(Long id, Paciente paciente) {
		findById(id);
		return pacienteRepository.save(paciente);
	}
	
	// DELETE
	public void deleta(Long id) {
		findById(id);
		pacienteRepository.deleteById(id);
	}
}
