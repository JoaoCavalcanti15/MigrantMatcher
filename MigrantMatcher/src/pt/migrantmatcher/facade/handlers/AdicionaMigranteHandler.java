package pt.migrantmatcher.facade.handlers;
import pt.migrantmatcher.domain.*;
import java.util.Scanner;

public class AdicionaMigranteHandler {
	
	private CatalogoMigrantes cm;
	private CatalogoRegioes cr;
	private CatalogoVoluntarios cv;
	String currentUserName;
	int currentUserTel;
	String currentDados;
	int currentMembros;


	public Migrante indicaNomeTel (String nome, int tel) {
		currentUserName = nome;
		currentUserTel = tel;
		return cm.criarMigrante(nome, tel, cv.getItems(),cv.getAlojamentos());
	}
	
	public void indicaNumFamilia(int membros) {
		currentMembros = membros;
	}
	
	public void indicaMembros(String dados) {
		currentDados = dados;
	}
	
	public void indicaCabecaCasal(Migrante m) {
		cm.criarMigranteFamilia(m.getNome(), m.getTelefone(), m.getAjudasItem(), m.getAjudasAlojamento(), currentMembros, currentDados);
	}
	
	public void pedirLista() {
		System.out.println("Regioes: ");
		for (int i = 0; i < cr.getRegioes().size(); i++) {
			System.out.println(cr.getRegioes().get(i).getNome());
		}
	}
	
	public void indicaRegiao (String nomeRegiao) {
		Scanner s = new Scanner(System.in);
		int f = 0;
		for (int i = 0; i < cr.getRegioes().size(); i++) {
			if (cr.getRegioes().get(i).getNome().equals(nomeRegiao) && !cr.getRegioes().get(i).getAlojamentos().isEmpty()) {
				f = i;
				for (int j = 0; j < cr.getRegioes().get(i).getAlojamentos().size(); i++) {
					System.out.println("Alojamento " + (j + 1) +  ": " + cr.getRegioes().get(i).getAlojamentos().get(j));
				}
			}
		}
		System.out.println("Indique o numero do alojamento que deseja: ");
		int num = s.nextInt();
		if (num > 0) {
			VoluntarioAlojamento va = cr.getRegioes().get(f).getAlojamentos().get(num);
			indicaAjudaAlojamento(va);
		}
		else if (num <= 0) {
			System.out.println("Esse alojamento não existe.");
		}
		
		System.out.println("Agora escolha o item que quer para ajuda: ");
		for (int i = 0; i < cv.getItems().size(); i++) {
			System.out.println("Item " + (i + 1) + ": " + cv.getItems().get(i).getDescricao());
		}
		System.out.println("Indique o numero do item que deseja: ");
		int nu = s.nextInt();
		if (nu > 0) {
			VoluntarioItem vi = cv.getItems().get(nu);
			indicaAjudaItem(vi);
		}
		else if (nu <= 0) {
			System.out.println("Esse item não existe.");
		}
		s.close();
		
	}
	
	private void indicaAjudaItem(VoluntarioItem vi) {
		for (int i = 0; i < cm.getMigrantes().size(); i++) {
			if (cm.getMigrantes().get(i).getNome().equals(currentUserName)) {
				cm.getMigrantes().get(i).getAjudasItem().add(vi);
			}
		}
	}

	private void indicaAjudaAlojamento(VoluntarioAlojamento va) {
		for (int i = 0; i < cm.getMigrantes().size(); i++) {
			if (cm.getMigrantes().get(i).getNome().equals(currentUserName)) {
				cm.getMigrantes().get(i).getAjudasAlojamento().add(va);
			}
		}
	}
}
