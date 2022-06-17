package pt.migrantmatcher.domain;

/**
 * 
 * @author Joao Cavalcanti Assis
 * 
 * Classe que representa um voluntario a ajuda alojamento
 *
 */
public class VoluntarioAlojamento extends VoluntarioAjuda{
	
	private int capacidade;
	private Regiao regiao;
	
	 /**
	  * Construtor de um voluntario a ajuda alojamento
	  * 
	  * @param telefone telefone do voluntario
	  */
	public VoluntarioAlojamento (int telefone) {
		super(telefone);
		this.capacidade = 0;
		this.regiao = new Regiao("");
	}
	
	/**
	 * Metodo que associa o alojamento com uma regiao
	 * 
	 * @param nome nome da regiao a associar
	 */
	public void indicaRegiao(String nome) {
		this.regiao = new Regiao(nome);
	}
	
	/**
	 * Metodo que associa o alojamenton a uma capacidade
	 * 
	 * @param max capacidade a ser associada
	 */
	public void indicaCapacidade (int max) {
		capacidade = max;
	}
	
	/**
	 * Metodo que devolve a capacidade do alojamento
	 * 
	 * @return capacidade
	 */
	public int getCapacidade () {
		return capacidade;
	}
	
	/**
	 * Metodo que devolve a regiao do alojamento
	 * 
	 * @return regiao
	 */
	public Regiao getRegiao () {
		return regiao;
	}
}
