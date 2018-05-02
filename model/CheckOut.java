package model;

public class CheckOut {

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

    public CheckOut() {
    }

    public CheckOut(int idPokoju, int idGoscia) {
        this.idPokoju = idPokoju;
        this.idGoscia = idGoscia;
    }

}
