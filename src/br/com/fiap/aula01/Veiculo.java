package br.com.fiap.aula01;

public class Veiculo {
	
	private String modelo;
	
	private String marca;
	
	private int anoDeFabricacao;
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public void mover() {
		System.out.println("movendo " + this.marca + " - " + this.modelo + " - " + this.anoDeFabricacao);
	}

	public void parar() {
		System.out.println("parando " + this.marca + " - " + this.modelo + " - " + this.anoDeFabricacao);
	}

	public void acelerar() {
		System.out.println("acelerar()");
	}

	public void frear() {
		System.out.println("frear()");
	}
	
}
