package Stapel_Warteschlange;

public class Warteschlange {
    // first in first out (FIFO)
    private int in;
    private int out;
    private int laenge;
    private String[] liste;
    public Warteschlange(int groesse) {
        liste = new String[groesse];
        in = 0;
        out = 0;
        laenge = groesse;
    }

    public void einfuegen(String s) {
        if (in+1 > laenge) return;
        if (liste[in] != null) return;
        liste[in++] = s;
    }

    public void entfernen(String s) {
        if (out+1 > laenge) return;
        if (liste[out] == null) return;
        liste[out++] = null;
    }
}
