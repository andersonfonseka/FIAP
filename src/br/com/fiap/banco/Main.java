package br.com.fiap.banco;

import java.util.Collection;

import br.com.fiap.banco.entidades.Agencia;
import br.com.fiap.banco.entidades.Banco;
import br.com.fiap.banco.entidades.Cliente;
import br.com.fiap.banco.entidades.ContaComum;
import br.com.fiap.banco.entidades.ContaEspecial;
import br.com.fiap.banco.entidades.IConta;
import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;
import br.com.fiap.banco.repositorio.ContaRepositorioMemoria;
import br.com.fiap.banco.repositorio.IContaRepositorio;

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
		
		IConta contaComum = new ContaComum(banco, cliente, agencia01, "123456-7");
		
		System.out.println(contaComum);
		System.out.println("------------------------------------------");
		
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(100);
		contaComum.obterSaldo();
		System.out.println("------------------------------------------");
		contaComum.depositar(50);
		contaComum.obterSaldo();
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		IConta contaEspecial = new ContaEspecial(banco, cliente1, agencia02, "456789-0", 500);
		
		System.out.println(contaEspecial);
		System.out.println("------------------------------------------");
		
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		contaEspecial.depositar(100);
		contaEspecial.obterSaldo();
		
		System.out.println("------------------------------------------");
		
		try {
			contaEspecial.sacar(250);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		contaEspecial.obterSaldo();
		System.out.println("------------------------------------------");
	
		contaComum.transferir(contaEspecial, 10);

		System.out.println("------------------------------------------");
		contaComum.obterSaldo();
		contaEspecial.obterSaldo();
		
		
		
		IContaRepositorio repositorioMemoria = ContaRepositorioMemoria.obterRepositorio();
		repositorioMemoria.criar(contaComum);
		repositorioMemoria.criar(contaEspecial);
		
		System.out.println("////////////////////////////////////////////////////");
		
		Collection<IConta> contas = repositorioMemoria.listarTodos();
		
		for (IConta iConta : contas) {
			System.out.println(iConta);
		}
		
		System.out.println("////////////////////////////////////////////////////");
		
		System.out.println(repositorioMemoria.ler(1L));
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Gabriel");
		
		ContaComum contaComum2 = new ContaComum(banco, cliente2, agencia01, "99999-9");
		contaComum2.setId(1L);
		
		repositorioMemoria.atualizar(contaComum2);
		
		System.out.println(repositorioMemoria.ler(1L));
		
		System.out.println("////////////////////////////////////////////////////");
		
		repositorioMemoria.deletar(contaComum2);
		
		contas = repositorioMemoria.listarTodos();
		
		for (IConta iConta : contas) {
			System.out.println(iConta);
		}
		
	}
	
}
