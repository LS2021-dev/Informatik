public class HanoiStapel {
    int[] inhalt;
    int position; // erster freier Platz
    public HanoiStapel (int maxHoehe) {
        inhalt = new int[maxHoehe];
        position = 0;
    }

    public int entnehmen() {
        if (position > 0) {
            int returned = inhalt[--position];
            inhalt[position] = 0;
            return returned;
        }
        return -1;
    }

    public boolean einfuegen (int n) {
        if (position < inhalt.length) {
            inhalt[position++] = n;
            return true;
        }
        return false;
    }

    public void druckeScheibeAnPosition(int n) {
        int laenge = 0;
        if (n < position) laenge = inhalt[n];
        String s = "-";
        String b = " ";
        String output = s.repeat(laenge) + b.repeat(inhalt.length-laenge);
        System.out.print(output);
    }
}