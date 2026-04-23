public class Verbraucher extends Thread
{
    private Puffer puf;
    private String name;
    private int seq;
    
    public Verbraucher(String s, Puffer p) {
        puf = p;
        name = s;
    }
    
    public void run() {
        String s;
        while (true) {
            s = puf.entnehmen().inhalt;
            System.out.println(name + " entnahm " + s);
        }
    }
}
