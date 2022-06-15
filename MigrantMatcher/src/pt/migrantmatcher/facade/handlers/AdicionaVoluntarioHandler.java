package pt.migrantmatcher.facade.handlers;
import pt.migrantmatcher.domain.*;
import java.util.Scanner;
import com.pidgeonsmssender.sdk.*;

public class AdicionaVoluntarioHandler {
	
	private CatalogoVoluntarios cv;
	private CatalogoRegioes cr;
	int currentUserTel = 0;

	public void identificaContacto(int tel) {
		currentUserTel = tel;
		cv.criarVoluntario(currentUserTel);
	}
	
	public void indicarTipoAjuda (String tipo) {
		
		if (tipo.equals("item")) {
			Scanner s = new Scanner(System.in);
			System.out.println("Indique a descrição do item: ");
			String descricao= s.nextLine();
			indicarDescricao(descricao);
			s.close();
		}
		
		else if (tipo.equals("alojamento")) {
			Scanner s = new Scanner(System.in);
			System.out.println("Indique o numero de pessoas que o alojamento suporta: ");
			int numPessoas = s.nextInt();
			System.out.println("Indique a região que se encontra o alojamento: ");
			String str = s.nextLine();
			indicaNumPessoasRegiao(numPessoas, str);
			s.close();
			
		}
		
	}

	private void indicaNumPessoasRegiao(int numPessoas, String str) {
		Regiao reg = cr.criarRegião(str, cv.getAlojamentos());	
		cv.criarAjudaAlojamento(currentUserTel, numPessoas, reg);
	}


	private void indicarDescricao(String descricao) {
		cv.criarAjudaItem(currentUserTel, descricao);
	}
	
	public void indicarCodigo (String codigo) {
		PidgeonSMSSender p = new PidgeonSMSSender();
		p.send(codigo, "Confirmado!");
	}
	
}
