public class TestGraph {
    private Graph g;

    public TestGraph() {
        g = new Graph(100);
        g.addKnoten("Jens");
        g.addKnoten("Stefan");
        g.addKnoten("Christian");
        g.addKnoten("Gabi");
        g.addKnoten("Boris");
        
        g.addKanteU(0,1);
        g.addKanteU(1,2);
        g.addKanteU(2,4);
        g.addKanteU(3,4);

        g.knotenListeDrucken();
        g.adjmatDrucken();
        g.tiefensucheStarten(2);
    }
}
