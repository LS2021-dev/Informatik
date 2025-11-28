public class BaumTest {
    private Baum b;
    public BaumTest() {
        b = new Baum();
        b.sortiertEinfuegen("Hund");
        b.sortiertEinfuegen("Kaffee");
        b.sortiertEinfuegen("Tisch");
        b.sortiertEinfuegen("Baum");
        b.sortiertEinfuegen("Himmel");
        b.sortiertEinfuegen("Wasser");
        b.sortiertEinfuegen("Blume");
        b.sortiertEinfuegen("Haus");
        b.sortiertEinfuegen("Schokolade");
        b.sortiertEinfuegen("Auto");
        b.sortiertEinfuegen("Mond");
        b.sortiertEinfuegen("Buch");
        b.sortiertEinfuegen("Vogel");
        b.sortiertEinfuegen("Fahrrad");
        b.sortiertEinfuegen("Torte");
        b.sortiertEinfuegen("Stadt");
        b.sortiertEinfuegen("Licht");
        b.sortiertEinfuegen("Berg");
        b.sortiertEinfuegen("Fluss");
        b.sortiertEinfuegen("Regen");
        b.sortiertEinfuegen("Wolke");
        b.sortiertEinfuegen("Fisch");
        b.sortiertEinfuegen("Kamera");
        b.sortiertEinfuegen("Pflanze");
        b.sortiertEinfuegen("Zug");
        b.sortiertEinfuegen("Fenster");
        b.sortiertEinfuegen("Kuchen");
        b.sortiertEinfuegen("Laptop");
        b.sortiertEinfuegen("Löffel");
        b.sortiertEinfuegen("Schrank");
        b.sortiertEinfuegen("Stuhl");
        
        b.traversieren("inorder");
    }
}