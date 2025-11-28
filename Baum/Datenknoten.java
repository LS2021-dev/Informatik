public class Datenknoten extends Baumelement
{
    private Baumelement astLinks;
    private Baumelement astRechts;
    private Datenelement inhalt;

    public Datenknoten (Datenelement de, Baumelement al, Baumelement ar){
        inhalt = de;
        astLinks = al;
        astRechts = ar;
    }

    public Datenelement gibInhalt() {
        return inhalt;
    }

    public Baumelement sortiertEinfuegen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            schreibe("Einfügen nicht möglich! Element " + inhalt.name + " vorhanden!");
        } else if (de.istKleiner(inhalt)) {
            astLinks = astLinks.sortiertEinfuegen(de);
        } else {
            astRechts = astRechts.sortiertEinfuegen(de);
        }
        return this;
    }

    public Datenelement erstesSuchen(Datenelement de) {
        if (de.istGleich(inhalt)) {
            return inhalt;
        }
        if (de.istKleiner(inhalt)) {
            return astLinks.erstesSuchen(de);
        } else {
            return astRechts.erstesSuchen(de);
        }
    }

    public void traversieren(String art) {
        switch (art) {
            case "preorder":
                schreibe(inhalt.name);
                astLinks.traversieren(art);
                astRechts.traversieren(art);
                break;
            case "inorder":
                astLinks.traversieren(art);
                schreibe(inhalt.name);
                astRechts.traversieren(art);
                break;
            case "postorder":
                astLinks.traversieren(art);
                astRechts.traversieren(art);
                schreibe(inhalt.name);
                break;
            default:
                schreibe("Ungültige Traversierungsart! Verwende 'preorder', 'inorder' oder 'postorder'!");
        }
    }
}

