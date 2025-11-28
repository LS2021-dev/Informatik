public abstract class Baumelement extends Tools {
    public abstract Baumelement sortiertEinfuegen(Datenelement de);

    public abstract Datenelement gibInhalt();

    public abstract Datenelement erstesSuchen(Datenelement de);

    public abstract void traversieren(String art);
}