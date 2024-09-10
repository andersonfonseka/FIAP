package br.com.fiap.aula07;

import java.util.Date;

public class ClienteJDBC {

	public static void main(String[] args) throws Exception {
		

		ICategoriaRepositorio jdbc = new CategoriaRepositorioPSImpl();

		jdbc.excluirTodos();

		jdbc.inserir(1, "MATERIAL ESCOLAR");
		jdbc.inserir(2, "AUTOMOVEIS");

		jdbc.consultar();

		jdbc.alterar(1, "PAPELARIA");

		jdbc.consultar();
		
		System.out.println(new Date());


	}

}
