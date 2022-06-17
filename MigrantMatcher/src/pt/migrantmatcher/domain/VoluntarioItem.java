package pt.migrantmatcher.domain;

/**
 * 
 * @author Joao Cavalcanti Assis
 * 
 * Classe que representa um voluntario a ajuda item
 *
 */
public class VoluntarioItem extends VoluntarioAjuda {
    
    private String descricao;

    /**
     * Contrutor de um voluntario a ajuda item
     * 
     * @param telefone telefone do voluntario
     */
    public VoluntarioItem (int telefone) {
    	super(telefone);
    	this.descricao = "";
    }

    /**
     * Metodo que associa um item a uma descricao
     * 
     * @param d descricao a ser associada
     */
    public void adicionarDescricao(String d) {
    	this.descricao = d;
    }
    
    /**
     * Metodo que devolve a descricao do item
     * 
     * @return descricao
     */
    public String getDescricao () {
        return this.descricao;
    }
   
}
