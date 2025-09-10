package com.mj.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table (name = "PESSOA")
public class PessoaModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public PessoaModel () {
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
}