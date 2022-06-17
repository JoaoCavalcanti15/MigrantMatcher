package pt.migrantmatcher.main;
import pt.migrantmatcher.domain.*;
import pt.migrantmatcher.handlers.*;

/**
 * 
 * @author Joao Cavalcanti Assis 56325
 * 
 * Classe que representa o software MigrantMathcer
 *
 */
public class MigrantMatcher {
	
	private CatalogoVoluntarios catV;
	private CatalogoMigrantes catM;
	private CatalogoRegioes catR;
	
	/**
	 * Construtor do MigrantMatcher
	 */
	public MigrantMatcher () {
		this.catV = new CatalogoVoluntarios();
		this.catM = new CatalogoMigrantes();
		this.catR = new CatalogoRegioes();
	}
	
	public AdicionaVoluntarioHandler getVoluntarioHandler () {
		return new AdicionaVoluntarioHandler (catV, catR);
	}
	
	public AdicionaMigranteHandler getMigranteHandler () {
		return new AdicionaMigranteHandler (catM, catR, catV);
	}
}
