public class Monitor
{
    private Puffer puf;
    private Erzeuger[] e;
    private Verbraucher[] v;
    
    public Monitor () {
        puf = new Puffer(100);
        e = new Erzeuger[1000];
        v = new Verbraucher[1000];
        
        for (int i=0; i<3; i++) {
            e[i] = new Erzeuger("Erzeuger " + i, puf);
            e[i].start();
        }
        
        for (int i=0; i<3; i++) {
            v[i] = new Verbraucher("Verbraucher " + i, puf);
            v[i].start();
        }
    }
    
    public void toggleDebug() {
        puf.debug = !puf.debug;
    }
    
    public void zeigePuffer() {
        puf.zeigePuffer();
    }
}
