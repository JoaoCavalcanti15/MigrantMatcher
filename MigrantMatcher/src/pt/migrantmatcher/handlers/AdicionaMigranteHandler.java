package pt.migrantmatcher.handlers;
import pt.migrantmatcher.domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Joao Cavalcanti Assis
 * 
 * Classe que representa um handler do caso de uso Adicionar Migrante 
 *
 */
public class AdicionaMigranteHandler {
	
	private CatalogoMigrantes catM;
	private CatalogoRegioes catR;
	private CatalogoVoluntarios catV;
	private int membros;
	private String dados;
	private String nome;
	
	/**
	 * Constutor do handler
	 * 
	 * @param cm catalogo migrantes
	 * @param cr catalogo regioes
	 * @param cv catalogo voluntarios a ajuda
	 */
	public AdicionaMigranteHandler(CatalogoMigrantes cm, CatalogoRegioes cr, CatalogoVoluntarios cv) {
		this.catM = cm;
		this.catR = cr;
		this.catV = cv;
	}

	/**
	 * Metodo que cria novo migrante com um certo nome e telefone
	 * 
	 * @param nome nome do migrante
	 * @param tel telefone do migrante
	 */
	public void indicaNomeTel (String nome, int tel) {
		this.nome = nome;
		catM.criarMigrante(nome, tel);
	}
	
	/**
	 * Metodo que associa os membros de uma familia migrante
	 * 
	 * @param membros numero de pessoas da familia a ser associados
	 */
	public void indicaNumFamilia(int membros) {
		this.membros = membros;
	}
	
	/**
	 * Metodo que associa os dados de uma familia migrante
	 * 
	 * @param dados dados dos membros
	 */
	public void indicaMembros(String dados) {
		this.dados = dados;
	}
	
	/**
	 * Metodo que cria uma nova familia migrante com um migrante cabeca de casal
	 * 
	 * @param m migrante cabeca de casal
	 */
	public void indicaCabecaCasal (Migrante m) {
		catM.criarMigranteFamilia(m.getNome(), m.getTelefone(), membros, dados);
	}
	
	/**
	 * Metodo que retorna uma lista de todas as regioes
	 * 
	 * @return lista regioes
	 */
	public List<Regiao> pedirLista() {
		return catR.getRegioes();
	}
	
	/**
	 * Metodo que retorna uma lista de voluntarios a ajuda em uma certa regiao
	 * 
	 * @param nomeRegiao nome da regiao
	 * @return lista de voluntarios a ajuda
	 */
	public List<VoluntarioAjuda> indicaRegiao (String nomeRegiao) {
		List<VoluntarioAjuda> v = new ArrayList<>();
		for (int i = 0; i < catV.getAlojamentos().size(); i++) {
			if (catV.getAlojamentos().get(i).getRegiao().getNome().equals(nomeRegiao)) {
				v.add(catV.getVoluntarios().get(i));
			}
		}
		return v;
	}
	
	/** 
	 * Metodo que associa um migrante a um voluntario a ajuda item
	 * 
	 * @param va voluntario a ser associado
	 */
	public void escolherAjudaItem (VoluntarioItem va) {
		for (int i = 0; i < catM.getMigrantes().size(); i++) {
			if (catM.getMigrantes().get(i).getNome().equals(nome)) {
				catM.getMigrantes().get(i).associarAjudaItem(va);
			}
		}
	}
	
	/**
	 * Metodo que associa um migrante a um voluntario a ajuda alojamento
	 * 
	 * @param va voluntario a ser associado
	 */
	public void escolherAjudaAlojamento (VoluntarioAlojamento va) {
		for (int i = 0; i < catM.getMigrantes().size(); i++) {
			if (catM.getMigrantes().get(i).getNome().equals(nome)) {
				catM.getMigrantes().get(i).associarAjudaAlojamento(va);
			}
		}
	}
	
	/**
	 * Metodo que retorna o catalogo de voluntarios a ajuda
	 * 
	 * @return catalogo voluntarios
	 */
	public CatalogoVoluntarios getCagalogoVoluntarios() {
		return catV;
	}
	
	/**
	 * Metodo que retorna o catalogo de regioes
	 * 
	 * @return catalogo regioes
	 */
	public CatalogoRegioes getCagalogoRegioes() {
		return catR;
	}
	
	/**
	 * Metodo que retorna o catalogo de migrantes
	 * 
	 * @return catalogo migrantes
	 */
	public CatalogoMigrantes getCatalogoMigrantes () {
		return catM;
	}
	
}
