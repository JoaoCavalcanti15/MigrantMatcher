package pt.migrantmatcher.domain;
import java.util.List;

public class Migrante {
	
	protected static String nome;
	protected static int telefone;
	protected static List<VoluntarioItem> li;
	protected static List<VoluntarioAlojamento> la;
	
	public Migrante (String name, int tel, List<VoluntarioItem> lista1, List<VoluntarioAlojamento> lista2) {
		nome = name;
		telefone = tel;
		li = lista1;
		la = lista2;
	}
	
	public void associarAjudaItem (VoluntarioItem vi) {
		li.add(vi);
	}
	
	public void associarAjudaAlojamento (VoluntarioAlojamento va) {
		la.add(va);
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getTelefone () {
		return telefone;
	}
	
	public List<VoluntarioItem> getAjudasItem () {
		return li;
	}
	
	public List<VoluntarioAlojamento> getAjudasAlojamento () {
		return la;
	}
}
