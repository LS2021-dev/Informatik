public class Hanoi extends Tools {
    private HanoiStapel[] stapel;
    private int gesamtZahl;
    private int zuege;

    public Hanoi(int groesse) {
        stapel = new HanoiStapel[3];
        gesamtZahl = groesse;
        // Stapel erzeugen
        for (int i=0; i<=2; i++) {
            stapel[i] = new HanoiStapel(groesse);
        }

        // Stapel 0 füllen
        for (int i=gesamtZahl; i>0; i--) {
            stapel[0].einfuegen(i);
        }

    }
    
    public void starten() {
        zuege = 0;
        machHanoi(6, 0, 2, 1);
    }

    public void scheibeZiehen(int von, int nach) {
        schreibe("Zug Nummer " + ++zuege); 
        stapel[nach].einfuegen(stapel[von].entnehmen());
        druckeAlleStapel();
    }

    public void machHanoi(int anzahl, int von, int nach, int hilfs) {
        schreibe("Bewege " + anzahl + " Scheiben von " + von + " nach " + nach);
        if (anzahl == 1) {
            scheibeZiehen(von, nach);
        } else {
            machHanoi(anzahl - 1, von, hilfs, nach);
            scheibeZiehen(von, nach);
            machHanoi(anzahl - 1, hilfs, nach, von);
        }
    }

    public void druckeAlleStapel() {
        for (int i=gesamtZahl-1; i>=0; i--) {
            for (int k=0; k<=2; k++) {
                stapel[k].druckeScheibeAnPosition(i);
                schreibeInZeile(" | ");
            }
            schreibe(""); // neue Zeile
        }
        schreibe("");
    }
}