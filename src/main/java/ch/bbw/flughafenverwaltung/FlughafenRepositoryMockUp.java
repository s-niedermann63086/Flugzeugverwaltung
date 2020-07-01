package ch.bbw.flughafenverwaltung;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@Service
public class FlughafenRepositoryMockUp {

    Flughafen flughafen;

    public FlughafenRepositoryMockUp() {
        ArrayList<Passagier> passagiere = new ArrayList<>();

        Passagier passagier_1 = new Passagier("Hanz", "Müller", 80);
        Passagier passagier_2 = new Passagier("Peter", "Gans", 80);
        Passagier passagier_3 = new Passagier("Lucas", "Vogel", 80);
        passagiere.addAll(Arrays.asList(passagier_1, passagier_2, passagier_3));

        ArrayList<Flugzeug> flugzeuge = new ArrayList<>();

        Flugzeug flugzeug_1 = new PassagierFlugzeug("Airbus A320", "HB-3489", 20000, 10000, 0, 70000, 1000, 150, 0, passagiere);
        Flugzeug flugzeug_2 = new FrachtFlugzeug("Douglas DC-8-55F", "LM1314", 18000, 6000, 0, 70000, 1000, 25000);
        Flugzeug flugzeug_3 = new PassagierFlugzeug("Runway34 IL-14", "BJK45-45", 300, 300, 0, 70000, 1000, 200, 0, passagiere);
        Flugzeug flugzeug_4 = new FrachtFlugzeug("Boeing 777-300ER", "BU 78z3", 24000, 12000, 0, 70000, 1000, 30000);
        Flugzeug flugzeug_5 = new Wasserflugzeug("Waterplan XD55", "WP200", 500, 500, 0, 70000, 1000, 8000);
        flugzeuge.addAll(Arrays.asList(flugzeug_1, flugzeug_2, flugzeug_3, flugzeug_4, flugzeug_5));
        flughafen = new Flughafen(flugzeuge);
    }

    public ArrayList<Flugzeug> getFlugzeuge(int id) {
        if (id == 0) {
            flughafen.getFlugzeugListe().sort(Comparator.comparing(Flugzeug::getName));
        } else if (id == 1) {
            flughafen.getFlugzeugListe().sort(Comparator.comparing(Flugzeug::getKennzeichen));
        } else if (id == 2) {
            flughafen.getFlugzeugListe().sort(Comparator.comparing(Flugzeug::getTankinhalt, Comparator.reverseOrder()));
        } else if (id == 3) {
            flughafen.getFlugzeugListe().sort(Comparator.comparing(Flugzeug::getTankinhaltAktuell, Comparator.reverseOrder()));
        } else if (id == 4) {
            flughafen.getFlugzeugListe().sort(Comparator.comparing(Flugzeug::getGewicht, Comparator.reverseOrder()));
        }
        return flughafen.getFlugzeugListe();
    }

    public int getTotalGewicht() {
        int gewicht = 0;
        for (int i = 0; i < flughafen.getFlugzeugListe().size(); i++) {
            gewicht += flughafen.getFlugzeugListe().get(i).getGewicht();
        }
        return gewicht;
    }

    public int getTotalTreibtoff() {
        int treibstoff = 0;
        for (int i = 0; i < flughafen.getFlugzeugListe().size(); i++) {
            treibstoff += flughafen.getFlugzeugListe().get(i).getTankinhaltAktuell();
        }
        return treibstoff;
    }
}
