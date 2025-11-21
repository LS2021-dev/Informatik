package Stapel_Warteschlange;

public class Stapel {
    // last in first out (LIFO)
    public String[] liste;
    private int position;
    private int laenge;

    public Stapel(int groesse) {
        position = 0;
        liste = new String[groesse];
        laenge = groesse;
    }

    public void einfuegen(String s) {
        if (liste[position] != null) return; // --> voll
        if (position+1 > laenge) return; // out of bounds
        liste[position++] = s;
    }

    public void entfernen() {
        if (liste[position] == null) return;
        if (position+1 > laenge) return;
        liste[position--] = null;
    }
}
