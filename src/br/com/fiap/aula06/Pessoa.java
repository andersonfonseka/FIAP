package br.com.fiap.aula06;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nome;
	
	private int idade;
	
	private double salario;


	public Pessoa(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public double getSalario() {
		return salario;
	}

	
	@Override
	public String toString() {
		return "Nome " + this.nome + " : Idade " + this.idade + " : Salario " + this.salario;
	}

}
