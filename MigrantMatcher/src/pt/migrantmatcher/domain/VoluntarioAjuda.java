package pt.migrantmatcher.domain;

public class VoluntarioAjuda {

    protected static int telefone;

    public VoluntarioAjuda (int tel) {
        telefone = tel;
    }

    public int getTelefone () {
        return telefone;
    }

}