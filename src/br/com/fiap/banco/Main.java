package br.com.fiap.banco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("FIAP");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro");
		
		Conta conta = new Conta();
		conta.setBanco(banco);
		conta.setCliente(cliente);
		conta.setNumero("123456-7");
		conta.setSaldo(0);
		
		System.out.println("Banco :" + conta.getBanco().getNome());
		System.out.println("Cliente :" + conta.getCliente().getNome());
		System.out.println("------------------------------------------");
		
		conta.obterSaldo();
		System.out.println("------------------------------------------");
		conta.depositar(100);
		conta.obterSaldo();
		System.out.println("------------------------------------------");
		conta.depositar(50);
		conta.obterSaldo();
		System.out.println("------------------------------------------");
		conta.sacar(200);
		conta.obterSaldo();
		
		System.out.println("------------------------------------------------------------------------");
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setBanco(banco);
		contaCorrente.setAgencia("0001");
		contaCorrente.setCliente(cliente1);
		contaCorrente.setLimite(500);

		System.out.println("Banco :" + contaCorrente.getBanco().getNome());
		System.out.println("Cliente :" + contaCorrente.getCliente().getNome());
		System.out.println("Limite :" + contaCorrente.getLimite());
		System.out.println("------------------------------------------");
		
		contaCorrente.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaCorrente.depositar(100);
		contaCorrente.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaCorrente.sacar(250);
		contaCorrente.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaCorrente.sacar(350);
		contaCorrente.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaCorrente.sacar(100);
		contaCorrente.obterSaldo();
		
		
	}
	
}
