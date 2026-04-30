public class LeserSchreiber
{
    private Wertspeicher ws;
    
    public LeserSchreiber() {
        ws = new Wertspeicher();
        
        for (int i=0; i<3; i++) {
            new Schreiber("Schreiber " + i, ws).start();
        }
        
        for (int i=0; i<3; i++) {
            new Leser("Leser " + i, ws).start();
        }
    }
}