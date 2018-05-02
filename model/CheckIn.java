package model;

public class CheckIn {

protected int idPokoju;
protected int idGoscia;

    public int getIdPokoju() {
        return idPokoju;
    }

    public void setIdPokoju(int idPokoju) {
        this.idPokoju = idPokoju;
    }


    public int getIdGoscia() {
        return idGoscia;
    }

    public void setIdGoscia(int idGoscia) {
        this.idGoscia = idGoscia;
    }

    public CheckIn() {
    }

    public CheckIn(int idPokoju, int idGoscia) {
        this.idPokoju = idPokoju;
        this.idGoscia = idGoscia;
    }
}
