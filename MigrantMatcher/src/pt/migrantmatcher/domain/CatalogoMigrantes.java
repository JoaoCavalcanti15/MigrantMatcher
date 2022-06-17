package pt.migrantmatcher.domain;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que representa um catalogo de migranets para ajuda
 *
 */
public class CatalogoMigrantes {

	private List<Migrante> lm;
	private List<MigranteFamilia> lmf;
	
	/**
	 * Construtor do catalogo
	 */
	public CatalogoMigrantes () {
		this.lm = new ArrayList<>();
		this.lmf = new ArrayList<>();
	}
	
	/**
	 * Metodo que devolve lista de migrantes
	 * 
	 * @return lista migrantes
	 */
	public List<Migrante> getMigrantes () {
		return lm;
	}
	
	/**
	 * Metodo de devolve lista de migrantes familia
	 * @return
	 */
	public List<MigranteFamilia> getMigrantesFamilia () {
		return lmf;
	}
	
	/**
	 * Metodo que cria e adiciona um novo migrante ao catalogo 
	 * 
	 * @param nome nome no migrante
	 * @param tel telefone do migrante
	 */
	public void criarMigrante (String nome, int tel) {
		Migrante m = new Migrante (nome, tel);
		lm.add(m);
	}
	
	/**
	 * Metodo que cria e adiciona um novo migrante familia ao catalogo
	 * 
	 * @param nome nome migrante cabeca casal
	 * @param tel tel do migrante cabeca casal
	 * @param membros numero de membros da familia
	 * @param dados dados dos membros da familia
	 */
	public void criarMigranteFamilia (String nome, int tel, int membros, String dados) {
		MigranteFamilia mf = new MigranteFamilia(nome, tel);
		mf.adicionaMembros(membros, dados);
		lmf.add(mf);
	}
}
