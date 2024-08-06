package br.com.fiap.aula01;

public class Cliente {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setMarca("VW");
		carro.setModelo("Fusca");
		carro.setAnoDeFabricacao(1976);
		carro.setTipoCombustivel("Gasolina");
		
		carro.mover();
		carro.parar();
		
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setMarca("Caloi");
		bicicleta.setModelo("Barraforte");
		bicicleta.setAnoDeFabricacao(1990);
		bicicleta.setTemBagageiro(true);
		
		bicicleta.mover();
		
	}
	
}
