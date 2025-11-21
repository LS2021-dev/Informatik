public abstract class Listenelement {
    public abstract Listenelement einfuegen(Datenelement de);

    public abstract Listenelement sortiertEinfuegen(Datenelement de);

    public abstract int laengeBestimmen();

    public abstract Listenelement gibNaechster();

    public abstract Datenelement gibInhalt();
    
    public abstract Datenelement erstesSuchen(Datenelement de);
    
    public abstract Listenelement entfernen(Datenelement de);
    
    public abstract Liste multiSuche(Datenelement de, Liste ergebnisListe);

    public abstract void listeDrucken();
}