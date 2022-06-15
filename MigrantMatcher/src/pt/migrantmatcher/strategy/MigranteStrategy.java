package pt.migrantmatcher.strategy;
import pt.migrantmatcher.facade.handlers.*;
import java.util.Scanner;

public class MigranteStrategy {
	
	private AdicionaMigranteHandler mh;

	public void main () {
		Scanner sc = new Scanner (System.in);
		String name;
		int tel;
		int i = 0; 
		
		while (i == 0) {
			
			System.out.println("Indique seu nome: ");
			name = sc.next();
			
			System.out.println("Indique seu telefone: ");
			tel = sc.nextInt();
			
			mh.indicaNomeTel(name, tel);
			System.out.println("Quer adicionar familia? sim/nao");
			String yn = sc.next();
			
			if (yn.equals("sim")) {
				i++;
				System.out.println("Indica o numero de membros da sua familia: ");
				int membros = sc.nextInt();
				mh.indicaNumFamilia(membros);
				System.out.println("Indica os dados dos membros da sua familia: ");
				String dados = sc.nextLine();
				mh.indicaMembros(dados);
				mh.indicaCabecaCasal(mh.indicaNomeTel(name, tel));
			}
			
			else if (yn.equals("nao")) {
				i++;
				mh.indicaNomeTel(name, tel);
				mh.pedirLista();
				System.out.println("Digite o nome da regiao: ");
				mh.indicaRegiao(sc.next());
			}
			
			else {
				System.out.println("Esta opcao nao existe. Escolha novamente.");
				continue;
			}
			
		}
		
		sc.close();
	}
}
