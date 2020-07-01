package ch.bbw.flughafenverwaltung;

public class Passagier {

    private String vorname;
    private String nachname;
    private int gewicht;

    public Passagier(String vorname, String nachname, int gewicht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Passagiere{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
