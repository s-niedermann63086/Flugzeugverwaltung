package ch.bbw.flughafenverwaltung;

import java.util.ArrayList;
import java.util.Collections;

public class Flughafen {

    ArrayList<Flugzeug> flugzeugListe;

    public Flughafen(ArrayList<Flugzeug> flughafen) {
        this.flugzeugListe = flughafen;
    }

    public void flugzeugHinzufügen(Flugzeug flugzeug) {
        flugzeugListe.add(flugzeug);
    }

    public void flugzeugLöschen(Flugzeug flugzeug) {
        flugzeugListe.remove(flugzeug);
    }

    public ArrayList<Flugzeug> getFlugzeugListe() {
        return flugzeugListe;
    }

    public void alleTanken(int tankinhalt) {
        for (Flugzeug flugzeug : flugzeugListe) {
            flugzeug.tanken(tankinhalt);
        }
    }
}
