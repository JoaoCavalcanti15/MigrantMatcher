package pt.migrantmatcher.domain;
import java.util.Random;

/**
 * 
 * @author Joao Cavalcanti Assis
 * 
 * Classe que representa um voluntario a ajuda
 *
 */
public class VoluntarioAjuda {

    protected int tel;
    protected int codigo;

    /**
     * Construtor de um voluntario a ajuda
     * 
     * @param tel telefone do voluntario
     */
    public VoluntarioAjuda (int tel) {
    	Random r = new Random();
        this.tel = tel;
        this.codigo = r.nextInt(999999);
    }
    
    /**
     * Metodo que devolve o telefone de um voluntario a ajuda
     * 
     * @return telefone do voluntario
     */
    public int getTelefone () {
        return tel;
    }
    
    /**
     * Metodo que devolve o codigo de um voluntario
     * @return
     */
    public int getCode() {
    	return codigo;
    }

}