package br.com.fiap.banco;

public class Agencia {
	
	private String numero;
	
	private String nome;
	
	public Agencia(String numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	
	public String getNome() {
		return nome;
	}

	
	public String toString() {
		return numero + " - " + nome;
	}
	
	

}
