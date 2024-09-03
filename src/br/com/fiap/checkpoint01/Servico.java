package br.com.fiap.checkpoint01;

public class Servico implements Pagavel {
	
	private double custo;
	
	public Servico(double custo) {
		super();
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	@Override
	public double getValorAPagar() {
		return this.custo;
	}

}
