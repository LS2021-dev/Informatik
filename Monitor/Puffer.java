public class Puffer
{
    private Objekt[] p;
    private int in;
    private int out;

    public Puffer (int groesse) {
        p = new Objekt[groesse];
        in = 0;
        out = 0;
    }

    public synchronized void einfuegen(Objekt ob) {
        while (true) {
            try {
                if (p[in] == null) {
                    p[in] = ob;
                    in++;
                    if (in >= p.length) in = 0;
                    notifyAll();
                } else {
                    wait();
                }
            } catch (InterruptedException e) {}
        }
    }
    
    public synchronized Objekt entnehmen() {
        Objekt ergebnis = null;
        
        while (true) {
            try {
                if (p[out] != null) {
                    ergebnis = p[out];
                    p[out] = null;
                    out++;
                    if (out >= p.length) out = 0;
                    notifyAll();
                    return ergebnis;
                } else {
                    wait();
                }
            } catch (InterruptedException e) {}
        }
    }
}
