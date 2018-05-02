package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Gosc")
public class Gosc {

    protected int id;
    protected String imie;
    protected String nazwisko;
    protected String pesel;
    protected String nrTelefonu;
    protected String email;


    
    public Gosc() {
    }

    public Gosc(int id, String imie, String nazwisko, String pesel, String nrTelefonu, String email) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.nrTelefonu = nrTelefonu;
        this.email = email;
    }
    
    
    
    
    
    public int getId() {
        return id;
    }
    
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    @XmlElement
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @XmlElement
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    @XmlElement
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    @XmlElement
    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Gosc{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
