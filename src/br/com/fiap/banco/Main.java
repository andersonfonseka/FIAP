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
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setBanco(banco);
		contaEspecial.setAgencia("0001");
		contaEspecial.setCliente(cliente1);
		contaEspecial.setLimite(500);

		System.out.println("Banco :" + contaEspecial.getBanco().getNome());
		System.out.println("Cliente :" + contaEspecial.getCliente().getNome());
		System.out.println("Limite :" + contaEspecial.getLimite());
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
