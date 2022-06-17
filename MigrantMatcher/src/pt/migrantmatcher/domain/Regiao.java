package pt.migrantmatcher.domain;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que represente uma regiao
 *
 */
public class Regiao {

	private String nome;
	private List<VoluntarioAlojamento> la;
	
	/**
	 * Construtor da regiao
	 * 
	 * @param nome nome da regiao
	 */
	public Regiao (String nome) {
		this.nome = nome;
		this.la = new ArrayList<>();
	}
	
	/**
	 * Metodo que devolve o nome da regiao
	 * 
	 * @return nome da regiao
	 */
	public String getNome () {
		return nome;
	}
	
	/**
	 * Metodo que devolve uma lista de alojamentos da regiao
	 * 
	 * @return lista de alojamentos
	 */
	public List<VoluntarioAlojamento> getAlojamentos () {
		return la;
	}
	
}
