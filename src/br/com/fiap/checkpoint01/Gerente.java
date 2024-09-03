package br.com.fiap.checkpoint01;

public class Gerente extends Funcionario {
	
	private double bonus;

	public Gerente(String nome, double salarioBase, double bonus) {
		super(nome, salarioBase);
		this.bonus = bonus;
		
	}
	
	public double getBonus() {
		return bonus;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + this.bonus;
	}

	@Override
	public double getValorAPagar() {
		return calcularSalario();
	}

}
