package pt.migrantmatcher.domain;

public class VoluntarioItem extends VoluntarioAjuda {
    
    private String descricao;

    public VoluntarioItem (int telefone, String descricao) {
    	super(telefone);
        this.descricao = descricao;
    }

    public String getDescricao () {
        return this.descricao;
    }
   
}
