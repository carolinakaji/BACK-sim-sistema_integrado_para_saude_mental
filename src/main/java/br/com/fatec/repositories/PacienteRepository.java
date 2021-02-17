package br.com.fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
