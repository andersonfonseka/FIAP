package br.com.fiap.banco.repositorio;

import java.util.Collection;

import br.com.fiap.banco.entidades.IConta;

public interface IContaRepositorio {
	
	public void criar(IConta conta);
	
	public IConta ler(Long id);
	
	public void atualizar(IConta conta);
	
	public void deletar(IConta conta) ;
	
	public Collection<IConta> listarTodos();

}
