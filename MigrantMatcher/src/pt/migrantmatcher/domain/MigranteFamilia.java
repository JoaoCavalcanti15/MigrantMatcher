package pt.migrantmatcher.domain;

public class MigranteFamilia {

	private int membros;
	private String dados;
	private Migrante cabecaCasal;
	
	public MigranteFamilia (Migrante cabecaCasal, int membros, String dados) {
		this.cabecaCasal = cabecaCasal;
		this.membros = membros;
		this.dados = dados;
	}
	
	public int getMembros () {
		return membros;
	}
	
	public String getDados () {
		return dados;
	}
	
	public Migrante getCabecaCasal () {
		return cabecaCasal;
	}
	
	public void adicionaMembros (String d) {
		membros++;
		dados.concat(" " + d);
	}
}
