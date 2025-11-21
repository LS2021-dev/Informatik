package Kompositum;

public class Abschluss extends Listenelement {
    public Listenelement hintenEinfuegen(Datenelement de) {
        return new Datenknoten(de, this);
    }

    public Listenelement sortiertEinfuegen(Datenelement de) {
        return new Datenknoten(de, this);
    }

    public Listenelement hintenEntfernen() {
        return null;
    }

    public Listenelement alleEntfernen(Datenelement de) {
        return this;
    }

    public Datenelement suchen(Datenelement de) {
        return null;
    }

    public int laengeBestimmen() {
        return 0;
    }

    public void drucken () {

    }
}
