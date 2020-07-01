package ch.bbw.flughafenverwaltung;

public class Wasserflugzeug extends Flugzeug {

    private String name;
    private String kennzeichen;
    private int tankinhalt;
    private int tankinhaltAktuell;
    private int gewicht;
    private int maximalgewicht;
    private int leergewicht;
    private int wasser;
    private String ladung;

    public Wasserflugzeug(String name, String kennzeichen, int tankinhalt, int tankinhaltAktuell, int gewicht, int maximalgewicht, int leergewicht, int wasser) {
        this.name = name;
        this.kennzeichen = kennzeichen;
        this.tankinhalt = tankinhalt;
        this.tankinhaltAktuell = tankinhaltAktuell;
        this.gewicht = gewicht;
        this.maximalgewicht = maximalgewicht;
        this.leergewicht = leergewicht;
        this.wasser = wasser;
    }

    @Override
    public String toString() {
        return "Wasserflugzeug{" +
                "name='" + name + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", tankinhalt=" + tankinhalt +
                ", tankinhaltAktuell=" + tankinhaltAktuell +
                ", gewicht=" + gewicht +
                ", maximalgewicht=" + maximalgewicht +
                ", leergewicht=" + leergewicht +
                ", wasser=" + wasser +
                '}';
    }

    @Override
    public int getGewicht() {
        this.gewicht = leergewicht + tankinhalt + wasser;
        return gewicht;
    }

    @Override
    public String getLadung() {
        return "Wasserladung " + wasser + " Liter";
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

    @Override
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
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

    public int getWasser() {
        return wasser;
    }

    public void setWasser(int wasser) {
        this.wasser = wasser;
    }
}
