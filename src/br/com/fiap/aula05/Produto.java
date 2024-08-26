package br.com.fiap.aula05;

public class Produto {

	private String nome;
	
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0.0) {
			this.preco = preco;
		} else {
			System.out.println("Valor invalido!!");
		}
		
	}
	
	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setNome("Caneta");
		p.setPreco(-1);
		
		Produto p1 = new Produto();
		p1.setNome("Caneta");
		p1.setPreco(100);
		
		
	}
	
	
}
