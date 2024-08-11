package br.com.fiap.banco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("FIAP");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro");
		
		ContaComum contaComum = new ContaComum();
		contaComum.setBanco(banco);
		contaComum.setCliente(cliente);
		contaComum.setNumero("123456-7");
		contaComum.setSaldo(0);
		
		System.out.println("Banco :" + contaComum.getBanco().getNome());
		System.out.println("Cliente :" + contaComum.getCliente().getNome());
		System.out.println("------------------------------------------");
		
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(100);
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(50);
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.sacar(200);
		contaComum.obterSaldo();
		
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
