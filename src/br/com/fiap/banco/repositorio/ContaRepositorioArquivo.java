package br.com.fiap.banco.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.banco.entidades.IConta;

public class ContaRepositorioArquivo implements IContaRepositorio {

	private Map<Long, IConta> mapaRepositorio;
	
	private static ContaRepositorioArquivo INSTANCIA;
	
	private static Long contadorId = 1L;
	
	private ContaRepositorioArquivo() {
		mapaRepositorio = new HashMap<Long, IConta>();
	}
	
	public static ContaRepositorioArquivo obterRepositorio() {
		if (INSTANCIA == null) {
			INSTANCIA = new ContaRepositorioArquivo();
		}
		return INSTANCIA;
	}
	
	public void criar(IConta conta) {
		conta.setId(contadorId);
		this.mapaRepositorio.put(conta.getId(), conta);
		
		// Implementar persistencia em arquivo
		
		contadorId++;
	}
	
	public IConta ler(Long id) {
		IConta resultado = null;
		
		if (this.mapaRepositorio.containsKey(id)) {
			resultado = this.mapaRepositorio.get(id);
		}

		// Implementar persistencia em arquivo

		
		return resultado;
	}
	
	public void atualizar(IConta conta) {
		if (this.mapaRepositorio.containsKey(conta.getId())) {
			this.mapaRepositorio.put(conta.getId(), conta);
		}
		
		// Implementar persistencia em arquivo

	}
	
	public void deletar(IConta conta) {
		if (this.mapaRepositorio.containsKey(conta.getId())) {
			this.mapaRepositorio.remove(conta.getId());
		}
		
		// Implementar persistencia em arquivo

	}
	
	public Collection<IConta> listarTodos() {
		return this.mapaRepositorio.values();
		// Implementar persistencia em arquivo

	}
	
}
