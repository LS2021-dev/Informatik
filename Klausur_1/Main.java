import Graph.Graph;
import Rekursion.Rekursion;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addKnoten("A");
        g.addKnoten("B");
        g.addKnoten("C");
        g.addKnoten("D");
        g.addKnoten("E");
        g.addKnoten("F");
        g.addKnoten("G");
        g.addKnoten("H");
        g.addKnoten("I");
        g.addKnoten("J");

        g.addKante(0, 1);
        g.addKante(1, 2);
        g.addKante(2, 3);
        g.addKante(3, 7);
        g.addKante(7, 4);
        g.addKante(4, 5);
        g.tiefensuche(0);
    }
}