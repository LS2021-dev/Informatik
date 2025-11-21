package einfacheListe;

public class Datenknoten {
    private Datenelement inhalt;
    private Datenknoten naechster;
    public Datenknoten (Datenelement de) {
        inhalt = de;
        naechster = null;
    }

    public void hintenEinfuegen(Datenelement de) {
        if (naechster == null) {
            naechster = new Datenknoten(de);
        } else {
            naechster.hintenEinfuegen(de);
        }
    }

    public void drucken() {
        if (naechster == null) {
            System.out.println(inhalt.text);
        } else {
            naechster.drucken();
            System.out.println(inhalt.text);
        }
    }
}
