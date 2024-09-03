package br.com.fiap.checkpoint01;

public abstract class Funcionario implements Pagavel {

	private String nome;

	private double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}


	public abstract double calcularSalario();

}
