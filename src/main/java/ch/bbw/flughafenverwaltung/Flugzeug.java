package ch.bbw.flughafenverwaltung;

public abstract class Flugzeug {

    private String name;
    private String kennzeichen;
    private int tankinhalt;
    private int tankinhaltAktuell;
    private int gewicht;
    private String ladung;
    private int maximalgewicht;
    private int leergewicht;

    public Flugzeug(String name, String kennzeichen, int tankinhalt, int tankinhaltAktuell, int gewicht, int maximalgewicht, int leergewicht) {
        this.name = name;
        this.kennzeichen = kennzeichen;
        this.tankinhalt = tankinhalt;
        this.tankinhaltAktuell = tankinhaltAktuell;
        this.gewicht = gewicht;
        this.maximalgewicht = maximalgewicht;
        this.leergewicht = leergewicht;
    }

    public int getMaximalgewicht() {
        return maximalgewicht;
    }

    public void setMaximalgewicht(int maximalgewicht) {
        this.maximalgewicht = maximalgewicht;
    }

    public int getLeergewicht() {
        return leergewicht;
    }

    public void setLeergewicht(int leergewicht) {
        this.leergewicht = leergewicht;
    }

    public Flugzeug() {}

    public String getLadung() {
        return ladung;
    }

    public void setLadung(String ladung) {
        this.ladung = ladung;
    }

    @Override
    public String toString() {
        return "Flugzeug{" +
                "name='" + name + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", tankinhalt=" + tankinhalt +
                ", tankinhaltAktuell=" + tankinhaltAktuell +
                ", gewicht=" + gewicht +
                '}';
    }

    public void tanken(int liter) {
        tankinhaltAktuell += liter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getTankinhalt() {
        return tankinhalt;
    }

    public void setTankinhalt(int tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public int getTankinhaltAktuell() {
        return tankinhaltAktuell;
    }

    public void setTankinhaltAktuell(int tankinhaltAktuell) {
        this.tankinhaltAktuell = tankinhaltAktuell;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
