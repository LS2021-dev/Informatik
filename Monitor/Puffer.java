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
    
    public void schreibe(String s) {
        System.out.println(System.nanoTime() + ": " + s);
    }
    
    public void status() {
        int fuellstand = in - out;
        if (fuellstand < 0) fuellstand += p.length;
        if ((fuellstand == 0) && (p[in] != null)) fuellstand = p.length;
        schreibe("Füllstand: " + fuellstand);
    }

    public synchronized void einfuegen(String name, Objekt ob) {
        while (true) {
            try {
                status();
                schreibe("+++ " + name + " versucht Einfügen von " + ob.inhalt);
                if (p[in] == null) {
                    p[in] = ob;
                    in++;
                    if (in >= p.length) in = 0;
                    schreibe("+++ " + ob.inhalt + " erfolgreich eingefügt.");
                    notifyAll();
                    break;
                } else {
                    schreibe("+++ " + name + ": Einfügen von " + ob.inhalt + " nicht möglich, schlafe.");
                    wait();
                }
            } catch (InterruptedException e) {}
        }
    }
    
    public synchronized Objekt entnehmen(String name) {
        Objekt ergebnis = null;
        
        while (true) {
            try {
                status();
                schreibe("--- " + name + " versucht Entnehmen.");
                if (p[out] != null) {
                    ergebnis = p[out];
                    p[out] = null;
                    out++;
                    if (out >= p.length) out = 0;
                    schreibe("--- " + name + " hat " + ergebnis.inhalt + " erfolgreich entnommen.");
                    notifyAll();
                    return ergebnis;
                } else {
                    schreibe("--- " + name + ": Entnehmen nicht möglich, schlafe.");
                    wait();
                }
            } catch (InterruptedException e) {}
        }
    }
}
