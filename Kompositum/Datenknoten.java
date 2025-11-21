public class Datenknoten extends Listenelement
{
    private Listenelement naechster;
    private Datenelement inhalt;

    public Datenknoten (Datenelement de, Listenelement na){
        inhalt = de;
        naechster = na;
    }

    public Listenelement gibNaechster() {
        return naechster;
    }

    public Datenelement gibInhalt() {
        return inhalt;
    }

    public Listenelement einfuegen(Datenelement de){
        naechster = naechster.einfuegen(de);
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

    public int laengeBestimmen() {
        return naechster.laengeBestimmen()+1;
    }

    public Datenelement erstesSuchen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            return inhalt;
        } else {
            return naechster.erstesSuchen(de);
        }
    }
    
    public Listenelement entfernen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            return naechster.entfernen(de);
        } else {
            naechster = naechster.entfernen(de);
            return this;
        }
    }
    
    public Liste multiSuche(Datenelement de, Liste ergebnisListe) {
        if (de.istGleich(inhalt)) {
            ergebnisListe.einfuegen(inhalt);
        }
        return naechster.multiSuche(de, ergebnisListe);
    }

    public void listeDrucken(){
        inhalt.druckeDich();
        naechster.listeDrucken();
    }
}

