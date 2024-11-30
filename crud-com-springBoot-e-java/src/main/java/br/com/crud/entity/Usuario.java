package br.com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String nome;
	 private Number idade;
	 private String email;
	 
	 //Contrutores
	 public Usuario() {}
	 public Usuario(String nome, Number idade, String email) {
		 this.nome = nome;
		 this.idade = idade;
		 this.email = email;
	 }
	 
	//getters e Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Number getIdade() {
		return idade;
	}
	public void setIdade(Number idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
}
