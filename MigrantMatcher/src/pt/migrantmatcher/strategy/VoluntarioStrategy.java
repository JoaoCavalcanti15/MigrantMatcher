package pt.migrantmatcher.strategy;
import pt.migrantmatcher.facade.handlers.*;
import java.util.Scanner;


public class VoluntarioStrategy {

	private AdicionaVoluntarioHandler vh;
	
	public void main () {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (i == 0) {
			int tel;
			String ajuda;
			
			System.out.println("Indique seu telefone: ");
			tel = sc.nextInt();
			vh.identificaContacto(tel);
			
			System.out.println("Qual o seu tipo de ajuda? item/alojamento");
		    ajuda = sc.next();		
		    if (ajuda.equals("item") || ajuda.equals("alojamento")) {
		    	vh.indicarTipoAjuda(ajuda);
		    }
		}
		
		System.out.println("Indique o codigo enviado para seu telefone: ");
		String cod = sc.next();
		vh.indicarCodigo(cod);
		sc.close();

	}
}
