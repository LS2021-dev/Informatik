public class Datenknoten extends Listenelement
{
    private Listenelement naechster;
    private Datenelement inhalt;

    public Datenknoten (Datenelement de, Listenelement na){
        inhalt = de;
        naechster = na;
    }

    public Datenelement gibInhalt() {
        return inhalt;
    }

    public Listenelement sortiertEinfuegen(Datenelement de) {
        if (de.istKleiner(inhalt)) {
            return new Datenknoten(de, this);
        } else {
            naechster = naechster.sortiertEinfuegen(de);
            return this;
        }
    }

    public Datenelement erstesSuchen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            return inhalt;
        } else {
            return naechster.erstesSuchen(de);
        }
    }
}

