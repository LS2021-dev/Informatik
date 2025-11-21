public class Knoten extends Tools {
    public String name;
    public int index;
    public boolean besucht;
    
    public Knoten(String s, int i) {
        name = s;
        index = i;
    }
    
    public void druckDich() {
        schreibe(name);
    }
}