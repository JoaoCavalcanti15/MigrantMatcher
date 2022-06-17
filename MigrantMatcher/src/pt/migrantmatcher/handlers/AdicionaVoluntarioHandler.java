package pt.migrantmatcher.handlers;
import pt.migrantmatcher.domain.*;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 *
 * Classe que representa um hanlder do caso de uso Adicionar Voluntario
 * 
 */
public class AdicionaVoluntarioHandler {
	
	private CatalogoVoluntarios catV;
	private CatalogoRegioes catR;
	private int tel;
	private int numMax;
	private String description;
	
	/**
	 * Construtor do handler
	 * 
	 * @param cv catalogo voluntarios
	 * @param cr catalogo regioes
	 */
	public AdicionaVoluntarioHandler (CatalogoVoluntarios cv, CatalogoRegioes cr) {
		this.catV = cv;
		this.catR = cr;
	}

	/**
	 * Metodo que cria um novo voluntario com um certo telefone
	 * 
	 * @param tel telefone do voluntario
	 */
	public void identificaContacto(int tel) {
		this.tel = tel;
		catV.criarVoluntario(tel);
	}

	/**
	 * Metodo que associa a o alojamento a sua capacidade
	 * 
	 * @param numPessoas capacidade
	 */
	public void indicaNumPessoas(int numPessoas) {
		this.numMax = numPessoas;
	}
	
	/**
	 * Metodo que cria uma nova regiao e cria o novo alojamento nessa regiao
	 * 
	 * @param nome nome da regiao
	 */
	public void indicarRegiao (String nome) {
		catR.criarRegião(nome);
		catV.criarAjudaAlojamento(tel, numMax, nome);
	}

    /**
     * Metodo que cria o novo item com uma certa descricao
     * 
     * @param descricao descricao do item
     */
	public void indicarDescricao(String descricao) {
		this.description = descricao;
		catV.criarAjudaItem(tel, description);
	}
	
	/**
	 * Metodo que verifica se o codigo enviado pelo sms é valido
	 * 
	 * @param codigo codigo a ser verificado
	 * @return se foi verificado
	 */
	public Boolean indicarCodigo (int codigo) {
		Boolean b = false;
		for (int i = 0; i < catV.getVoluntarios().size(); i++) {
			if (catV.getVoluntarios().get(i).getCode() == codigo) {
				
				b = true;
			}
		}
		return b;
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
	
}
