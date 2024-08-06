package br.com.fiap.aula01;

public class Carro extends Veiculo {

	private String tipoCombustivel;

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
