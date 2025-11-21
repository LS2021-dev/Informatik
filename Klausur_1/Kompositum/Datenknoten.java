package Kompositum;

public class Datenknoten extends Listenelement{
    private Listenelement naechster;
    private Datenelement inhalt;

    public Datenknoten (Datenelement de, Listenelement na) {
        inhalt = de;
        naechster = na;
    }

    public Listenelement hintenEinfuegen(Datenelement de) {
        naechster = naechster.hintenEinfuegen(de);
        return this;
    }

    public Listenelement sortiertEinfuegen(Datenelement de) {
        if (de.istKleiner(inhalt)) {
            return new Datenknoten(de, this);
        } else {
            naechster = naechster.sortiertEinfuegen(de);
            return this;
        }
    }

    public Listenelement hintenEntfernen() {
        Listenelement n = naechster.hintenEntfernen();
        if (n == null) {
            return naechster;
        } else {
            naechster = n;
            return this;
        }
    }

    public Listenelement alleEntfernen(Datenelement de) {
        naechster = naechster.alleEntfernen(de);
        if (de.istGleich(inhalt)) {
            return naechster;
        } else {
            return this;
        }
    }

    public Datenelement suchen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            return inhalt;
        } else {
            return naechster.suchen(de);
        }
    }

    public int laengeBestimmen() {
        return naechster.laengeBestimmen()+1;
    }

    public void drucken() {
        System.out.println(inhalt.text);
        naechster.drucken();
    }
}
