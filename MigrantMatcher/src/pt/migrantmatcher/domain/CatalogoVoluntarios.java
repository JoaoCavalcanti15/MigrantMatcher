package pt.migrantmatcher.domain;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que representa um catalogo de voluntarios para ajuda
 *
 */
public class CatalogoVoluntarios {
	
	private List<VoluntarioAjuda> va;
	private List<VoluntarioItem> li;
	private List<VoluntarioAlojamento> la;

	/**
	 * Construtor do catalogo
	 */
	public CatalogoVoluntarios () {
		this.va = new ArrayList<>();
		this.li = new ArrayList<>();
		this.la = new ArrayList<>();
	}
	
	/**
	 * Metodo que devolde uma lista de voluntarios ajuda
	 * 
	 * @return lista voluntarios ajuda
	 */
	public List<VoluntarioAjuda> getVoluntarios () {
		return va;
	}
	
	/**
	 * Metodo que devolve uma lista de voluntarios ajuda item
	 * 
	 * @return lista voluntarios ajuda item
	 */
	public List<VoluntarioItem> getItems () {
		return li;
	}
	
	/**
	 * Metodo que devolve uma list de voluntarios ajuda alojamento
	 * 
	 * @return lista voluntarios ajuda alojamento
	 */
	public List<VoluntarioAlojamento> getAlojamentos () {
		return la;
	}
	
	/**
	 * Metodo que cria e adiciona um novo voluntario ajuda no catalogo
	 * 
	 * @param tel telefone do voluntario
	 */
	public void criarVoluntario (int tel) {
		VoluntarioAjuda v = new VoluntarioAjuda(tel);
		va.add(v);
	}
	
	/**
	 * Metodo que cria e adicioina um novo voluntario ajuda item no catalogo
	 * 
	 * @param tel telefone do voluntario
	 * @param descricao descricao do item
	 */
	public void criarAjudaItem (int tel, String descricao) {
		VoluntarioItem vi = new VoluntarioItem(tel);
		vi.adicionarDescricao(descricao);
		li.add(vi);
	}
	
	/**
	 * Metodo que cria e adiciona um novo voluntario ajuda alojamento no catalogo
	 * 
	 * @param tel telefone do voluntario
	 * @param capacidade capacidade maxima do alojamento
	 * @param regiao regiao em que o alojamento se encontra
	 */
	public void criarAjudaAlojamento (int tel, int capacidade, String regiao) {
		VoluntarioAlojamento va = new VoluntarioAlojamento(tel);
		va.indicaCapacidade(capacidade);
		va.indicaRegiao(regiao);
		la.add(va);
	}
	
}
