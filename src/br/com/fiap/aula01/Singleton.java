package br.com.fiap.aula01;

public class Singleton {

	private static Singleton INSTANCIA;
	
	private Singleton() {}
	
	public void print() {
		System.out.println("Imprimindo um teste...");
	}
	
	public static Singleton obterInstancia() {
		
		if (INSTANCIA == null) {
			INSTANCIA = new Singleton();
		} 
		
		return INSTANCIA;
	}
	
}
