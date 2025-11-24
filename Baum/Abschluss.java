public class Abschluss extends Listenelement {
    public Datenelement gibInhalt() {
        return null;
    }

    public Listenelement sortiertEinfuegen(Datenelement de) {
        return new Datenknoten (de, this);
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return null;
    }
}