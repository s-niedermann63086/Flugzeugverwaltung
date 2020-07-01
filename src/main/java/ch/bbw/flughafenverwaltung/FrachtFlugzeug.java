package ch.bbw.flughafenverwaltung;

public class FrachtFlugzeug extends Flugzeug {

    private String name;
    private String kennzeichen;
    private int tankinhalt;
    private int tankinhaltAktuell;
    private int gewicht;
    private int maximalgewicht;
    private int leergewicht;
    private int tonnen;
    private String ladung;

    public FrachtFlugzeug(String name, String kennzeichen, int tankinhalt, int tankinhaltAktuell, int gewicht, int maximalgewicht, int leergewicht, int tonnen) {
        this.name = name;
        this.kennzeichen = kennzeichen;
        this.tankinhalt = tankinhalt;
        this.tankinhaltAktuell = tankinhaltAktuell;
        this.gewicht = gewicht;
        this.maximalgewicht = maximalgewicht;
        this.leergewicht = leergewicht;
        this.tonnen = tonnen;
    }

    @Override
    public String toString() {
        return "FrachtFlugzeug{" +
                "name='" + name + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", tankinhalt=" + tankinhalt +
                ", tankinhaltAktuell=" + tankinhaltAktuell +
                ", gewicht=" + gewicht +
                ", maximalgewicht=" + maximalgewicht +
                ", leergewicht=" + leergewicht +
                ", tonnen=" + tonnen +
                '}';
    }


    @Override
    public int getGewicht() {
    this.gewicht = leergewicht + tonnen + tankinhaltAktuell;
        return gewicht;
    }

    @Override
    public String getLadung() {
        return "Frachtgewicht " + tonnen + " Tonnen";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @Override
    public int getTankinhalt() {
        return tankinhalt;
    }

    @Override
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public void setTankinhalt(int tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    @Override
    public int getTankinhaltAktuell() {
        return tankinhaltAktuell;
    }

    @Override
    public void setTankinhaltAktuell(int tankinhaltAktuell) {
        this.tankinhaltAktuell = tankinhaltAktuell;
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

    public int getTonnen() {
        return tonnen;
    }

    public void setTonnen(int tonnen) {
        this.tonnen = tonnen;
    }
}
