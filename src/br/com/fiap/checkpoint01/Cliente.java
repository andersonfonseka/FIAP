package br.com.fiap.checkpoint01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Joao", 1600, 50);
		Funcionario vendedor = new Vendedor("Maria", 5000, 200);
		
		System.out.println("Gerente " + gerente.calcularSalario());
		System.out.println("Vendedor " + vendedor.calcularSalario());
		
		
		System.out.println("Gerente Estatico : " + calcularSalario(gerente));
		System.out.println("Vendedor Estatico : " + calcularSalario(vendedor));
		
		List<Pagavel> pagaveis = new ArrayList<>();
		pagaveis.add(gerente);
		pagaveis.add(vendedor);
		pagaveis.add(new Servico(1000));
		
		System.out.println("Total pago " + exibirTotalAPagar(pagaveis));
		
	}
	
	public static double calcularSalario(Funcionario funcionario) {
		return funcionario.calcularSalario();
	}
	
	public static double exibirTotalAPagar(List<Pagavel> pagaveis) {
		
		double totalAPagar = 0;
		
		for(Pagavel pgvl: pagaveis) {
			totalAPagar += pgvl.getValorAPagar();
		}
		
		return totalAPagar;
	}
	
}
