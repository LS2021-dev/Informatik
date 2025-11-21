package einfacheListe;

public class Liste {
    private Datenknoten erster;
    public Liste() {
        erster = null;
    }

    public void hintenEinfuegen(String s) {
        if (erster == null) {
            erster = new Datenknoten(new Datenelement(s));
        } else {
            erster.hintenEinfuegen(new Datenelement(s));
        }
    }

    public void listeDrucken() {
        if (erster != null) {
            erster.drucken();
        }
    }
}
