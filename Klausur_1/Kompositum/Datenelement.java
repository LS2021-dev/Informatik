package Kompositum;

public class Datenelement {
    public String text;
    public Datenelement(String s) {
        text = s;
    }

    public boolean istGleich(Datenelement de) {
        return de.text.equals(text);
    }

    public boolean istKleiner(Datenelement de) {
        return (de.text.compareTo(text) >= 0);
    }
}
