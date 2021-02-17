package br.com.fatec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// Anotações do lombok para gerar automaticamente getters, setter e construtor padrão
@Getter
@Setter
@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String password;
	private String nome;
	private String sobrenome;
	private String celular;
	private String cpf;
	private String endereco;
	private int numero;
	private String cidade;
	private String uf;
	private String url;
	private Date data_nascimento;

	
	public Paciente() {}


	public Paciente(Long id, String email, String password, String nome, String sobrenome, String celular, String cpf,
			String endereco, int numero, String cidade, String uf, String url, Date data_nascimento) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.celular = celular;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
		this.url = url;
		this.data_nascimento = data_nascimento;
	}



	


}
