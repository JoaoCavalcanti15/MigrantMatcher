package pt.migrantmatcher.domain;
import java.util.*;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que representa uma familia de migrantes
 *
 */
public class MigranteFamilia extends Migrante{

	private Migrante cabecaCasal;
	private int membros;
	private String dados;
	private List<Migrante> familia;
	
	/**
	 * Construtor da uma familia de migrantes
	 * 
	 * @param nome nome do cabeca de casal
	 * @param tel telefone do cabeca de casal
	 */
	public MigranteFamilia (String nome, int tel) {
		super(nome, tel);
		this.membros = 0;
		this.dados = "";
		this.familia = new ArrayList<>();
		this.cabecaCasal = new Migrante(nome, tel);
		familia.add(cabecaCasal);
	}
	
	/**
	 * Metodo que devolve a quantidade de membros da familia
	 * @return
	 */
	public int getMembros () {
		return membros;
	}
	
	/**
	 * Metodo que devolve os dados da familia
	 * @return
	 */
	public String getDados () {
		return dados;
	}
	
	/**
	 * Metodo que adiciona membros a familia
	 * 
	 * @param quantos quantidade de membros a adicionar
	 * @param descricao descricao dos membros
	 */
	public void adicionaMembros (int quantos, String descricao) {
		membros += quantos;
		dados = descricao;
	}
}
