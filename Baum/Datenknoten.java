public class Datenknoten extends Baumelement
{
    private Baumelement naechster;
    private Datenelement inhalt;

    public Datenknoten (Datenelement de, Baumelement na){
        inhalt = de;
        naechster = na;
    }

    public Datenelement gibInhalt() {
        return inhalt;
    }

    public Baumelement sortiertEinfuegen(Datenelement de) {
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

