package pt.migrantmatcher.domain;
import java.util.List;

public class CatalogoMigrantes {

	private List<Migrante> lm;
	private List<MigranteFamilia> lmf;
	
	public CatalogoMigrantes (List<Migrante> lm, List<MigranteFamilia> lmf) {
		this.lm = lm;
		this.lmf = lmf;
	}
	
	public List<Migrante> getMigrantes () {
		return lm;
	}
	
	public List<MigranteFamilia> getMigrantesFamilia () {
		return lmf;
	}
	
	public Migrante criarMigrante (String nome, int telefone, List<VoluntarioItem> l1, List<VoluntarioAlojamento> l2) {
		Migrante m = new Migrante (nome, telefone, l1, l2);
		lm.add(m);
		return m;
	}
	
	public void criarMigranteFamilia (String nome, int telefone, List<VoluntarioItem> l1, List<VoluntarioAlojamento> l2, int membros, String dados) {
		Migrante m = new Migrante (nome, telefone, l1, l2);
		MigranteFamilia mf = new MigranteFamilia (m, membros, dados);
		lmf.add(mf);
	}
}
