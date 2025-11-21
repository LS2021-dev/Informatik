package Kompositum;

public abstract class Listenelement {
    public abstract Listenelement hintenEinfuegen(Datenelement de);
    public abstract Listenelement sortiertEinfuegen(Datenelement de);
    public abstract Listenelement hintenEntfernen();
    public abstract Listenelement alleEntfernen(Datenelement de);
    public abstract Datenelement suchen(Datenelement de);
    public abstract int laengeBestimmen();
    public abstract void drucken();
}
