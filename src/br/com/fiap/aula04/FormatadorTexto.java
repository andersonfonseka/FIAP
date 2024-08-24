package br.com.fiap.aula04;

public class FormatadorTexto {

	public static void main(String[] args) {
		
		String texto = "o rato roeu a roupa do rei de roma";
		
		String[] palavras = texto.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			
			String resultado1 = palavras[i].substring(0, 1).toUpperCase();
			String resultado2 = palavras[i].substring(1);
			
			System.out.println(resultado1+resultado2);
		}
		
		
	}
	
}
