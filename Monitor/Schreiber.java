public class Schreiber extends Thread
{
    private Wertspeicher ws;
    private String name;
    int i = 0;
    
    public Schreiber(String s, Wertspeicher w) {
        ws = w;
        name = s;
    }
    
    public void run() {
        String s;
        while (true) {
            i++;
            ws.writeValues(name, i);
            System.out.println(name + " schrieb " + i);
        }
    }
}
