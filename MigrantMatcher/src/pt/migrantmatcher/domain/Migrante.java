package pt.migrantmatcher.domain;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 *
 * Classe que representa um Migrante
 */
public class Migrante {
	
	protected String nome;
	protected int tel;
	protected List<VoluntarioItem> li;
	protected List<VoluntarioAlojamento> la;
	
	/**
	 * Construtor do Migrante
	 * 
	 * @param nome nome do migrante
	 * @param tel telefone do migrante
	 */
	public Migrante (String nome, int tel) {
		this.nome = nome;
		this.tel = tel;
		this.li = new ArrayList<>();
		this.la = new ArrayList<>();
	}
	
	/**
	 * Metodo que associa um voluntario a ajuda item ao migrante
	 * 
	 * @param vi voluntario a ser associado
	 */
	public void associarAjudaItem (VoluntarioItem vi) {
		li.add(vi);
	}
	
	/**
	 * Metodo que associa um voluntario a ajuda alojamento ao migrante
	 * 
	 * @param va voluntario a ser associado
	 */
	public void associarAjudaAlojamento (VoluntarioAlojamento va) {
		la.add(va);
	}
	
	/**
	 * Metodo que devolve o nome do migrante
	 * 
	 * @return nome do migrante
	 */
	public String getNome () {
		return nome;
	}
	
	/**
	 * Metodo que devolve o telefone do migrante
	 * 
	 * @return telefone do migrante
	 */
	public int getTelefone () {
		return tel;
	}
	
	/**
	 * Metodo que devolve a lista de ajudas item do migrante
	 * 
	 * @return lista ajudas item
	 */
	public List<VoluntarioItem> getAjudasItem () {
		return li;
	}
	 /**
	  * Metodo que retorna a lista de ajudas alojamento do migrante
	  * 
	  * @return lista ajudas alojamento
	  */
	public List<VoluntarioAlojamento> getAjudasAlojamento () {
		return la;
	}

}
