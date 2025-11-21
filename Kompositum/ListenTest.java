public class ListenTest extends Tools {
    private Liste l;
    public ListenTest() {
        l = new Liste();
        l.sortiertEinfuegen("Hund");
        l.sortiertEinfuegen("Kaffee");
        l.sortiertEinfuegen("Tisch");
        l.sortiertEinfuegen("Baum");
        l.sortiertEinfuegen("Himmel");
        l.sortiertEinfuegen("Wasser");
        l.sortiertEinfuegen("Blume");
        l.sortiertEinfuegen("Haus");
        l.sortiertEinfuegen("Schokolade");
        l.sortiertEinfuegen("Auto");
        l.sortiertEinfuegen("Mond");
        l.sortiertEinfuegen("Buch");
        l.sortiertEinfuegen("Vogel");
        l.sortiertEinfuegen("Fahrrad");
        l.sortiertEinfuegen("Torte");
        l.sortiertEinfuegen("Stadt");
        l.sortiertEinfuegen("Licht");
        l.sortiertEinfuegen("Berg");
        l.sortiertEinfuegen("Fluss");
        l.sortiertEinfuegen("Regen");
        l.sortiertEinfuegen("Wolke");
        l.sortiertEinfuegen("Fisch");
        l.sortiertEinfuegen("Kamera");
        l.sortiertEinfuegen("Kamera");
        l.sortiertEinfuegen("Kamera");
        l.sortiertEinfuegen("Kamera");
        l.sortiertEinfuegen("Pflanze");
        l.sortiertEinfuegen("Zug");
        l.sortiertEinfuegen("Fenster");
        l.sortiertEinfuegen("Kuchen");
        l.sortiertEinfuegen("Laptop");
        l.sortiertEinfuegen("Löffel");
        l.sortiertEinfuegen("Schrank");
        l.sortiertEinfuegen("Stuhl");
        
        Datenelement vergleich = new Datenelement("Wolke");
        vergleich.compareMode = "SAME_LENGTH";
        
        l.multiSuche(vergleich).listeDrucken();
        
    }

    public String suchen(String s) {
        return l.erstesSuchen(s).name;
    }
}
