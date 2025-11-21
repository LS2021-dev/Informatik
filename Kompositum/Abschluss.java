public class Abschluss extends Listenelement {

    public Listenelement gibNaechster() {
        return this;
    }

    public Datenelement gibInhalt() {
        return null;
    }

    public void listeDrucken() {
    };

    public Listenelement einfuegen(Datenelement de) {
        return new Datenknoten(de, this);
    }

    public Listenelement sortiertEinfuegen(Datenelement de) {
        return new Datenknoten (de, this);
    }

    public int laengeBestimmen() {
        return 0;
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return null;
    }

    public Listenelement entfernen(Datenelement de) {
        return this;
    }

    public Liste multiSuche(Datenelement de, Liste ergebnisListe) {
        return ergebnisListe;
    }
}