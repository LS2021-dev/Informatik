public class Graph extends Tools {
    private int anzahl;
    private Knoten[] k;
    private int[][] adjmat;

    public Graph(int g) {
        anzahl = 0;
        k = new Knoten[g];
        adjmat = new int[g][g];
    }

    public void tiefensuche(int i) {
        k[i].besucht = true;
        schreibe("Knoten " + k[i].name + " wurde besucht.");
        for (int j = 0; j<anzahl; j++) { // ist Nachbar
            if (adjmat[i][j] > 0) {
                schreibeInZeile(k[j].name + " ist Nachbar von " + k[i].name + "... ");
                if (!k[j].besucht) {
                    schreibe("und unbesucht! Los gehts!");
                    tiefensuche(j);
                } else {
                    schreibe("aber schon besucht. Lassen wir weg.");
                }
            }
        }
    }

    public void setzeAlleUnbesucht() {
        for (int i=0; i<anzahl;i++) k[i].besucht = false;
    }

    public void tiefensucheStarten(int start) {
        setzeAlleUnbesucht();
        tiefensuche(start);
    }

    public void addKnoten(String n) {
        k[anzahl] = new Knoten(n, anzahl++);
    }

    public void knotenListeDrucken() {
        for (int i=0;i<k.length;i++) {
            if (k[i] == null) return;
            schreibe("[" + i + "] " + k[i].name);
        }
    }

    public void addKante(int von, int nach, int gewicht) {
        adjmat[von][nach] = gewicht;
    }

    public void addKanteU(int von, int nach, int gewicht) {
        addKante(von, nach, gewicht);
        addKante(nach, von, gewicht);
    }

    public void addKante(int von, int nach) {
        addKante(von, nach, 1);
    }

    public void addKanteU(int von, int nach) {
        addKanteU(von, nach, 1);
    }

    public void adjmatDrucken() {
        for (int i = 0; i<anzahl; i++) {
            for(int k = 0; k<anzahl; k++) {
                schreibeInZeile(adjmat[i][k] + " ");
            }
            schreibe("");
        }
    }
}