package pt.migrantmatcher.domain;
import java.util.List;

public class Regiao {

	private String nome;
	private List<VoluntarioAlojamento> la;
	
	public Regiao (String nome, List<VoluntarioAlojamento> la) {
		this.nome = nome;
		this.la = la;
	}
	
	public String getNome () {
		return nome;
	}
	
	public List<VoluntarioAlojamento> getAlojamentos () {
		return la;
	}
	
}
