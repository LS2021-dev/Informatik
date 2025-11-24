public class Baum
{
    private Listenelement erster;

    public Baum() {
        erster = new Abschluss();
    }

    public void sortiertEinfuegen (String s) {
        sortiertEinfuegen(new Datenelement(s));
    }

    public void sortiertEinfuegen (Datenelement de){
        erster = erster.sortiertEinfuegen(de);
    }

    public Datenelement erstesSuchen(String s) {
        return erstesSuchen(new Datenelement(s));
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return erster.erstesSuchen(de);
    }
}
