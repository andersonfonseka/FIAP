package br.com.fiap.aula01;

public class Bicicleta extends Veiculo implements IVeiculo {
	

	private boolean temBagageiro;

	public Bicicleta() {}
	
	public Bicicleta(String modelo, String marca, int anoDeFabricacao) {
		super(modelo, marca, anoDeFabricacao);
	}
	
	public boolean isTemBagageiro() {
		return temBagageiro;
	}

	public void setTemBagageiro(boolean temBagageiro) {
		this.temBagageiro = temBagageiro;
	}
	
	public void mover() {
		System.out.println("movendo " + this.getMarca() + " - " + this.getModelo() + " - " + this.getAnoDeFabricacao()
				+ " - Tem Bagageiro :" + this.isTemBagageiro());
	}

}
