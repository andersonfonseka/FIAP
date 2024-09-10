package br.com.fiap.aula07;

public interface ICategoriaRepositorio {

	public void consultar();

	public void inserir(int id, String nome);

	public void alterar(int id, String nome);

	public void excluir(int id);

	public void excluirTodos();
}
