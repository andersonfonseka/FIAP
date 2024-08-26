package br.com.fiap.aula05;

public class Aluno {
	
	private String nome;
	
	private int idade;
	
	private double nota;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			System.out.println("Idade invalida");
		}
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
		} else {
			System.out.println("Nota invalida");
		}
	}
	
	public static void main(String[] args) {
		
		Aluno aln = new Aluno();
		aln.setNome("Maria");
		aln.setIdade(1);
		aln.setNota(10);
		
		
	}
	

}
