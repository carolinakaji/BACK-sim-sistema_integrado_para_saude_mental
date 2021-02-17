package br.com.fatec.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fatec.entities.Paciente;
import br.com.fatec.service.PacienteService;

@RequestMapping("/pacientes")
@RestController
public class PacienteResource {

	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> listarTodos(){
		List<Paciente> listaPaciente = pacienteService.findAll();
		return ResponseEntity.ok().body(listaPaciente);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> listarPorId(@PathVariable Long id){
		Paciente paciente = pacienteService.findById(id);
		return ResponseEntity.ok().body(paciente);
	}
	
	@PostMapping
	public ResponseEntity<Paciente> salvaPaciente(@RequestBody Paciente paciente){
		Paciente pacienteSalvo = pacienteService.salvar(paciente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pacienteSalvo.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> atualizaPaciente(@PathVariable Long id, @RequestBody Paciente paciente){
		pacienteService.atualiza(id, paciente);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletaPaciente(@PathVariable Long id){
		pacienteService.deleta(id);
		return ResponseEntity.noContent().build();
	}
}
