public class Erzeuger extends Thread
{
    private Puffer puf;
    private String name;
    private int seq;
    
    public Erzeuger(String s, Puffer p) {
        puf = p;
        name = s;
        seq = 0;
    }
    
    public void run() {
        while (true) {
            puf.einfuegen(name, new Objekt(name + " Nr. " + seq++));
        }
    }
}
