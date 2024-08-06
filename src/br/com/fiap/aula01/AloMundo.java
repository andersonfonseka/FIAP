package br.com.fiap.aula01;

public class AloMundo {
	
	private String nome = "Maria";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void main(String[] args) {
		
		AloMundo alm = new AloMundo();
		
		System.out.println(alm.getNome());

		alm.setNome("Jose");
		System.out.println(alm.getNome());
		
		
	}
	
	
	
	
}
