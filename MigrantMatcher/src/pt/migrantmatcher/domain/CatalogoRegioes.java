package pt.migrantmatcher.domain;
import java.util.List;

public class CatalogoRegioes {

	private List<Regiao> lr;
	
	public CatalogoRegioes(List<Regiao> lr) {
		this.lr = lr;
	}
	
	public Regiao criarRegião (String nome, List<VoluntarioAlojamento> la) {
		Regiao r = new Regiao(nome, la);
		lr.add(r);
		return r;
	}
	
	public List<Regiao> getRegioes () {
		return lr;
	}
	
}
