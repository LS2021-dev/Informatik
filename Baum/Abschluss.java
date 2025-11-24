public class Abschluss extends Baumelement {
    public Datenelement gibInhalt() {
        return null;
    }

    public Baumelement sortiertEinfuegen(Datenelement de) {
        return new Datenknoten (de, this);
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return null;
    }
}