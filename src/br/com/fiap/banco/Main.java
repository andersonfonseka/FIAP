package br.com.fiap.banco;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fiap.banco.exception.SaldoInsuficienteException;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("Banco FIAP");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro");
		
		Agencia agencia01 = new Agencia("0001", "Lins");
		Agencia agencia02 = new Agencia("0002", "Paulista");

		
		ContaComum contaComum = new ContaComum(banco, cliente, agencia01, "123456-7");
		
		System.out.println("Banco : " + contaComum.getBanco().getNome());
		System.out.println("Cliente : " + contaComum.getCliente().getNome());
		System.out.println("Agencia : " + contaComum.getAgencia());
		System.out.println("Conta : " + contaComum.getNumero());
		System.out.println("------------------------------------------");
		
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(100);
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(50);
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		
		
		try {
			contaComum.sacar(20000);
		} catch (SaldoInsuficienteException e) {
		//	System.out.println(e.getMessage()); 
		}
		
		
		contaComum.obterSaldo();
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		ContaEspecial contaEspecial = new ContaEspecial(banco, cliente1, agencia02, "456789-0", 500);
	
		System.out.println("Banco : " + contaEspecial.getBanco().getNome());
		System.out.println("Cliente : " + contaEspecial.getCliente().getNome());
		System.out.println("Agencia : " + contaEspecial.getAgencia());
		System.out.println("Conta : " + contaEspecial.getNumero());
		System.out.println("Limite : " + contaEspecial.getLimite());
		System.out.println("------------------------------------------");
		
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaEspecial.depositar(100);
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaEspecial.sacar(250);
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaEspecial.sacar(350);
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaEspecial.sacar(100);
		contaEspecial.obterSaldo();
		
		
	}
	
}
