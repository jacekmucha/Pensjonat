package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "Pokoj")
public class Pokoj {

    private int id;
    private String typ;
    private boolean czyZajety;
    private int liczbaOsob;
    private int liczbaLozek;
    private int lozkoPodwojne;
    private boolean czyKlimatyzacja;
    private boolean czyLazienka;
    private float cena;
    private float powierzchnia;
    private String wyposazenie;


    public int getId() {
        return id;
    }
    
@XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }
    
@XmlElement
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public boolean isCzyZajety() {
        return czyZajety;
    }

    @XmlElement
    public void setCzyZajety(boolean czyZajety) {
        this.czyZajety = czyZajety;
    }

    public int getLiczbaOsob() {
        return liczbaOsob;
    }

    @XmlElement
    public void setLiczbaOsob(int liczbaOsob) {
        this.liczbaOsob = liczbaOsob;
    }

    public int getLiczbaLozek() {
        return liczbaLozek;
    }

    @XmlElement
    public void setLiczbaLozek(int liczbaLozek) {
        this.liczbaLozek = liczbaLozek;
    }

    public int getLozkoPodwojne() {
        return lozkoPodwojne;
    }

    @XmlElement
    public void setLozkoPodwojne(int lozkoPodwojne) {
        this.lozkoPodwojne = lozkoPodwojne;
    }

    public boolean isCzyKlimatyzacja() {
        return czyKlimatyzacja;
    }

    @XmlElement
    public void setCzyKlimatyzacja(boolean czyKlimatyzacja) {
        this.czyKlimatyzacja = czyKlimatyzacja;
    }

    public boolean isCzyLazienka() {
        return czyLazienka;
    }

    @XmlElement
    public void setCzyLazienka(boolean czyLazienka) {
        this.czyLazienka = czyLazienka;
    }

    public float getCena() {
        return cena;
    }

    @XmlElement
    public void setCena(float cena) {
        this.cena = cena;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    @XmlElement
    public void setPowierzchnia(float powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getWyposazenie() {
        return wyposazenie;
    }

    @XmlElement
    public void setWyposazenie(String wyposazenie) {
        this.wyposazenie = wyposazenie;
    }

    public Pokoj() {
    }

    public Pokoj(int id, String typ, boolean czyZajety, int liczbaOsob, int liczbaLozek,
                 int lozkoPodwojne, boolean czyKlimatyzacja, boolean czyLazienka,
                 float cena, float powierzchnia, String wyposazenie) {

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

    @Override
    public String toString() {
        return "Pokoj{" +
                "id=" + id +
                ", typ='" + typ + '\'' +
                ", czyZajety=" + czyZajety +
                ", liczbaOsob=" + liczbaOsob +
                ", liczbaLozek=" + liczbaLozek +
                ", lozkoPodwojne=" + lozkoPodwojne +
                ", czyKlimatyzacja=" + czyKlimatyzacja +
                ", czyLazienka=" + czyLazienka +
                ", cena=" + cena +
                ", powerzchnia=" + powierzchnia +
                ", wyposazenie='" + wyposazenie + '\'' +
                '}';
    }
}
