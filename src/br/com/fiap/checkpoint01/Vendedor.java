package br.com.fiap.checkpoint01;

public class Vendedor extends Funcionario {

	private double comissao;

	public Vendedor(String nome, double salarioBase, double comissao) {
		super(nome, salarioBase);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + comissao;
	}

	@Override
	public double getValorAPagar() {
		return calcularSalario();
	}

}
