package br.com.fiap.aula01;

public class Carro extends Veiculo implements IVeiculo {

	private String tipoCombustivel;
	
	public Carro() {}
	
	public Carro(String modelo, String marca, int anoDeFabricacao, String tipoCombustivel) {
		super(modelo, marca, anoDeFabricacao);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public void mover() {
		System.out.println("movendo " + this.getMarca() + " - " + this.getModelo() + " - " + this.getAnoDeFabricacao()
				+ " - " + this.tipoCombustivel);
	}

}
