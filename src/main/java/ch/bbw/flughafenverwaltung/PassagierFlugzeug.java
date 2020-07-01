package ch.bbw.flughafenverwaltung;

import java.util.ArrayList;

public class PassagierFlugzeug extends Flugzeug {

    private String name;
    private String kennzeichen;
    private int tankinhalt;
    private int tankinhaltAktuell;
    private int gewicht;
    private int maximalgewicht;
    private int leergewicht;
    private int maxPassagiere;
    private int durchschnittsgewicht;
    private ArrayList<Passagier> passagiere;
    private String ladung;

    public PassagierFlugzeug(String name, String kennzeichen, int tankinhalt, int tankinhaltAktuell, int gewicht, int maximalgewicht, int leergewicht, int maxPassagiere, int durchschnittsgewicht, ArrayList<Passagier> passagiere) {
        this.name = name;
        this.tankinhalt = tankinhalt;
        this.tankinhaltAktuell = tankinhaltAktuell;
        this.gewicht = gewicht;
        this.kennzeichen = kennzeichen;
        this.maximalgewicht = maximalgewicht;
        this.leergewicht = leergewicht;
        this.maxPassagiere = maxPassagiere;
        this.durchschnittsgewicht = durchschnittsgewicht;
        this.passagiere = passagiere;
    }

    @Override
    public String getLadung() {
        return "Passagiere gemeldet: " + passagiere.size();
    }

    @Override
    public void setLadung(String ladung) {
        this.ladung = ladung;
    }

    @Override
    public String toString() {
        return "PassagierFlugzeug{" +
                "name='" + name + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", tankinhalt=" + tankinhalt +
                ", tankinhaltAktuell=" + tankinhaltAktuell +
                ", gewicht=" + gewicht +
                ", maximalgewicht=" + maximalgewicht +
                ", leergewicht=" + leergewicht +
                ", maxPassagiere=" + maxPassagiere +
                ", durchschnittsgewicht=" + durchschnittsgewicht +
                ", passagiere=" + passagiere +
                '}';
    }

    @Override
    public int getGewicht() {
        this.gewicht = leergewicht + tankinhaltAktuell + getPassagierGewicht();
        return gewicht;
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

    public int getMaxPassagiere() {
        return maxPassagiere;
    }

    public void setMaxPassagiere(int maxPassagiere) {
        this.maxPassagiere = maxPassagiere;
    }

    public int getDurchschnittsgewicht() {
        return durchschnittsgewicht;
    }

    public void setDurchschnittsgewicht(int durchschnittsgewicht) {
        this.durchschnittsgewicht = durchschnittsgewicht;
    }

    public ArrayList<Passagier> getPassagiere() {
        return passagiere;
    }

    public void setPassagiere(ArrayList<Passagier> passagiere) {
        this.passagiere = passagiere;
    }

    public int getPassagierGewicht() {
        int passagierGewicht = 0;
        for (int i = 0; i < passagiere.size(); i++) {
            passagierGewicht += passagiere.get(i).getGewicht();
        }
        return passagierGewicht;
    }
}
