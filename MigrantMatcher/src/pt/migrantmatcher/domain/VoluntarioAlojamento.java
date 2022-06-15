package pt.migrantmatcher.domain;

public class VoluntarioAlojamento extends VoluntarioAjuda{
	
	private int capacidade;
	private Regiao regiao;
	
	public VoluntarioAlojamento (int telefone, int capacidade, Regiao regiao) {
		super(telefone);
		this.capacidade = capacidade;
		this.regiao = regiao;
	}
	
	public int getCapacidade () {
		return capacidade;
	}
	
	public Regiao getRegiao () {
		return regiao;
	}
}
