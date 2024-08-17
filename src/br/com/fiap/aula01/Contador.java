package br.com.fiap.aula01;

public class Contador {
	
	private static int numero = 0;
	
	public Contador() {
		numero++;
	}
	
	public static void teste() {
		System.out.println("O numero eh " + numero);
	}
	
	
	public static void main(String[] args) {
		
		Contador contador = new Contador();
				 	
		Contador contador1 = new Contador();
				 
		Contador contador2 = new Contador();
				 
		Contador.teste();
		
	}
	
}
