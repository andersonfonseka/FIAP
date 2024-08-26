package br.com.fiap.banco.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.banco.entidades.IConta;

public class ContaRepositorioMemoria implements IContaRepositorio {

	private Map<Long, IConta> mapaRepositorio;
	
	private static ContaRepositorioMemoria INSTANCIA;
	
	private static Long contadorId = 1L;
	
	private ContaRepositorioMemoria() {
		mapaRepositorio = new HashMap<Long, IConta>();
	}
	
	public static ContaRepositorioMemoria obterRepositorio() {
		if (INSTANCIA == null) {
			INSTANCIA = new ContaRepositorioMemoria();
		}
		return INSTANCIA;
	}
	
	public void criar(IConta conta) {
		conta.setId(contadorId);
		this.mapaRepositorio.put(conta.getId(), conta);
		contadorId++;
	}
	
	public IConta ler(Long id) {
		IConta resultado = null;
		
		if (this.mapaRepositorio.containsKey(id)) {
			resultado = this.mapaRepositorio.get(id);
		}
		
		return resultado;
	}
	
	public void atualizar(IConta conta) {
		if (this.mapaRepositorio.containsKey(conta.getId())) {
			this.mapaRepositorio.put(conta.getId(), conta);
		}
	}
	
	public void deletar(IConta conta) {
		if (this.mapaRepositorio.containsKey(conta.getId())) {
			this.mapaRepositorio.remove(conta.getId());
		}
	}
	
	public Collection<IConta> listarTodos() {
		return this.mapaRepositorio.values();
	}
	
}
