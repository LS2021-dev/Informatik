public class Baum
{
    private Baumelement wurzel;

    public Baum() {
        wurzel = new Abschluss();
    }

    public void sortiertEinfuegen (String s) {
        sortiertEinfuegen(new Datenelement(s));
    }

    public void sortiertEinfuegen (Datenelement de){
        wurzel = wurzel.sortiertEinfuegen(de);
    }

    public Datenelement erstesSuchen(String s) {
        return erstesSuchen(new Datenelement(s));
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return wurzel.erstesSuchen(de);
    }
}
