package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "Pokoj")
public class Pokoj {

    private int id;
    private String typ;
    private int czyZajety;
    private int liczbaOsob;
    private int liczbaLozek;
    private int lozkoPodwojne;
    private int czyKlimatyzacja;
    private int czyLazienka;
    private int cena;
    private int powierzchnia;
    private String wyposazenie;

    public Pokoj() {
    }

    public Pokoj(int id, String typ, int czyZajety, int liczbaOsob, int liczbaLozek, int lozkoPodwojne, int czyKlimatyzacja, 
            int czyLazienka, int cena, int powierzchnia, String wyposazenie) {
        
        this.id = id;
        this.typ = typ;
        this.czyZajety = czyZajety;
        this.liczbaOsob = liczbaOsob;
        this.liczbaLozek = liczbaLozek;
        this.lozkoPodwojne = lozkoPodwojne;
        this.czyKlimatyzacja = czyKlimatyzacja;
        this.czyLazienka = czyLazienka;
        this.cena = cena;
        this.powierzchnia = powierzchnia;
        this.wyposazenie = wyposazenie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getCzyZajety() {
        return czyZajety;
    }

    public void setCzyZajety(int czyZajety) {
        this.czyZajety = czyZajety;
    }

    public int getLiczbaOsob() {
        return liczbaOsob;
    }

    public void setLiczbaOsob(int liczbaOsob) {
        this.liczbaOsob = liczbaOsob;
    }

    public int getLiczbaLozek() {
        return liczbaLozek;
    }

    public void setLiczbaLozek(int liczbaLozek) {
        this.liczbaLozek = liczbaLozek;
    }

    public int getLozkoPodwojne() {
        return lozkoPodwojne;
    }

    public void setLozkoPodwojne(int lozkoPodwojne) {
        this.lozkoPodwojne = lozkoPodwojne;
    }

    public int getCzyKlimatyzacja() {
        return czyKlimatyzacja;
    }

    public void setCzyKlimatyzacja(int czyKlimatyzacja) {
        this.czyKlimatyzacja = czyKlimatyzacja;
    }

    public int getCzyLazienka() {
        return czyLazienka;
    }

    public void setCzyLazienka(int czyLazienka) {
        this.czyLazienka = czyLazienka;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getWyposazenie() {
        return wyposazenie;
    }

    public void setWyposazenie(String wyposazenie) {
        this.wyposazenie = wyposazenie;
    }
    
    

}