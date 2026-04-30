public class Leser extends Thread
{
    private Wertspeicher ws;
    private String name;
    
    public Leser(String s, Wertspeicher w) {
        ws = w;
        name = s;
    }
    
    public void run() {
        String s;
        while (true) {
            s = ws.readValues();
            System.out.println(name + " las " + s);
        }
    }
}
