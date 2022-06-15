package pt.migrantmatcher.domain;
import java.util.List;

public class CatalogoVoluntarios {
	
	private List<VoluntarioAjuda> va;
	private List<VoluntarioItem> li;
	private List<VoluntarioAlojamento> la;
	
	public CatalogoVoluntarios (List<VoluntarioAjuda> va, List<VoluntarioItem> li, List<VoluntarioAlojamento> la) {
		this.va = va;
		this.li = li;
		this.la = la;
	}
	
	public List<VoluntarioAjuda> getVoluntarios () {
		return va;
	}
	
	public List<VoluntarioItem> getItems () {
		return li;
	}
	
	public List<VoluntarioAlojamento> getAlojamentos () {
		return la;
	}
	
	public void criarVoluntario (int tel) {
		VoluntarioAjuda v = new VoluntarioAjuda(tel);
		va.add(v);
	}
	
	public void criarAjudaItem (int tel, String descricao) {
		VoluntarioItem vi = new VoluntarioItem(tel, descricao);
		li.add(vi);
	}
	
	public void criarAjudaAlojamento (int tel, int capacidade, Regiao regiao) {
		VoluntarioAlojamento va = new VoluntarioAlojamento(tel, capacidade, regiao);
		la.add(va);
	}
	
}
