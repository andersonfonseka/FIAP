package br.com.fiap.aula01;

public class Classe {
	
	private String valor;
	
	public void modificar(String valor) {
		this.valor = valor;
	}
	
	public void imprimir() {
		System.out.println(valor);
	}
	
	public static void main(String[] args) {
		
		Classe cls = new Classe();
		cls.modificar("A");
		cls.imprimir();

		Classe xyz = new Classe();
		xyz.modificar("B");
		xyz.imprimir();

		Classe abc = cls;
		abc.modificar("C");
		abc.imprimir();
		
		cls.imprimir();
		
	}
}
