package pt.migrantmatcher.domain;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que representa um catalogo de regioes para ajuda
 * 
 */
public class CatalogoRegioes {

	private List<Regiao> lr;

	
	/**
	 * Construtor do catalogo
	 */
	public CatalogoRegioes() {
		this.lr = new ArrayList<>();
	}
	
	/**
	 * Metodo que cria e adiciona uma nova regiao ao catalogo
	 * 
	 * @param nome
	 */
	public void criarRegião (String nome) {
		Regiao r = new Regiao(nome);
		lr.add(r);
	}
	
	/**
	 * Metodo que devolve lista das regioes 
	 * 
	 * @return lista regioes
	 */
	public List<Regiao> getRegioes () {
		return lr;
	}
	
}
