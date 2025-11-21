package Graph;

public class Graph {
    private Knoten[] knoten;
    private int anzahl;
    private int[][] adjmat;
    public Graph(int g) {
        knoten = new Knoten[g];
        anzahl = 0;
        adjmat = new int[g][g];
    }
    public void addKnoten(String s) {
        knoten[anzahl++] = new Knoten(s);
    }

    public void addKante(int von, int nach) {
        adjmat[von][nach] = 1;
        adjmat[nach][von] = 1;
    }

    public void tiefensuche(int i) {
        knoten[i].besucht = true;
        System.out.println(knoten[i].value);
        for (int j = 0; j < anzahl; j++) {
            if (adjmat[i][j] == 1 && !knoten[j].besucht) {
                tiefensuche(j);
            };
        }
    }

    public void alleUnbesuchtSetzen() {
        for (int i = 0; i < anzahl; i++) {
            knoten[i].besucht = false;
        }
    }

    public void printAdjmat() {
        for (int i = 0; i < anzahl; i++) {
            for (int j = 0; j < anzahl; j++) {
                System.out.print(adjmat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
