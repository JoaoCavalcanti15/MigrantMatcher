package pt.migrantmatcher.main;
import java.util.Scanner;
import pt.migrantmatcher.strategy.*;

public class MigrantMatcher {
	
	private static VoluntarioStrategy vs;
	private static MigranteStrategy ms;

	public static void main (String []args) {
		int i = 0;
		while (i == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Se quer ajudar, digite ajuda, se quer pedir ajuda, digite pedir.");
			String str = sc.nextLine();
			if (str.equals("ajuda")) {
				vs.main(); 
				i++;
			}
			else if (str.equals("pedir")) {
				ms.main();
				i++;
			}
			else {
				System.out.println("Essa opcao nao existe, escolha novamente");
			}
			sc.close();
		}
	}
}
