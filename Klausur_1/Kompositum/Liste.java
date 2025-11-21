package Kompositum;

public class Liste {
    private Listenelement erster;

    public Liste () {
        erster = new Abschluss();
    }

    public void hintenEinfuegen(String s) {
        erster = erster.hintenEinfuegen(new Datenelement(s));
    }

    public void vorneEinfuegen(String s) {
        erster = new Datenknoten(new Datenelement(s), erster);
    }

    public void sortiertEinfuegen(String s) {
        erster = erster.sortiertEinfuegen(new Datenelement(s));
    }

    public void hintenEntfernen() {
        erster.hintenEntfernen();
    }

    public void alleEntfernen(String s) {
        erster = erster.alleEntfernen(new Datenelement(s));
    }

    public void suchen(String s) {
        System.out.println(erster.suchen(new Datenelement(s)).text);
    }

    public void laengeBestimmen() {
        System.out.println(erster.laengeBestimmen());
    }

    public void listeDrucken() {
        erster.drucken();
    }
}
