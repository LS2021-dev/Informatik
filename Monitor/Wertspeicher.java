import java.util.concurrent.Semaphore;

public class Wertspeicher
{
    private String inhaltstring;
    private int inhaltzahl;
        
    private Semaphore s_leser;
    private Semaphore s_werte;
    
    private int aktiveLeser;
    
    public Wertspeicher() {
        inhaltstring = "";
        inhaltzahl = 0;
        
        s_leser = new Semaphore(1);
        s_werte = new Semaphore(1);
        
        aktiveLeser = 0;
    }
    
    public void writeValues(String s, int i) {
        try {
            s_werte.acquire(); // Ressource Semaphore belegen
            
            try {
                inhaltstring = s;
                inhaltzahl = i;
            } finally {
                s_werte.release();
            }
        } catch (InterruptedException e) {}
    }
    
    public String readValues() {
        String ergebnis = null;
        try {
            s_leser.acquire();
            try {
                aktiveLeser++;
                if (aktiveLeser == 1) {
                    // Bin der erste! Muss s_werte grabben!
                    s_werte.acquire();
                }
            } finally {
                s_leser.release();
            }
            
            // Lesevorgang
            ergebnis = inhaltstring + " (" + inhaltzahl + ")";
            
            s_leser.acquire();
            
            try {
                aktiveLeser--;
                if (aktiveLeser == 0) {
                    // War der letzte! Muss s_werte freigeben!
                    s_werte.release();
                }
            } finally {
                s_leser.release();
            }
            
            
        } catch (InterruptedException e) {}
        return ergebnis;
    }
}