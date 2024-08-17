package br.com.fiap.aula01;

public class Cliente2 {

	public static void main(String[] args) {
		
		Singleton sgl0 = Singleton.obterInstancia();
				  sgl0.print();

		Singleton sgl1 = Singleton.obterInstancia();
				  sgl1.print();
		  
				  
	}
	
}
