package br.com.fiap.banco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("FIAP");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Conta conta = new Conta();
		conta.setBanco(banco);
		conta.setCliente(cliente);
		conta.setNumero("123456-7");
		conta.setSaldo(0);
		
		conta.obterSaldo();
		conta.depositar(100);
		conta.obterSaldo();
		conta.depositar(50);
		conta.obterSaldo();
		
		
		
	}
	
}
