package br.com.fiap.aula04;

public class FraseInvertida {
	
	public static void main(String[] args) {
		
		String texto = "Escreva uma frase na ordem inversa";
		
		String[] palavras = texto.split(" ");
		
		for (int i = (palavras.length-1); i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		
		
	}

}
