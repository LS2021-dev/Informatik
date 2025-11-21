public class Rekursion extends Tools {
    int zaehler = 0;
    int[] cache = new int[10000];
    
    public int fak_it(int n) {
        int ergebnis = 1;
        for (int i=1; i<=n; i++) {
            ergebnis *= i;
            schreibe("i=" + i + ", ergebnis=" + ergebnis);
        }
        return ergebnis;
    }

    public int fak_rek(int n) {
        if (n == 0) return 1;
        schreibe(n + "! = " + n + " * " + (n - 1) + "!");
        return n*fak_rek(n-1);
    }
    
    public int fib_rek(int n) {
        schreibe(++zaehler + ": Berechene fib_rek von " + n);
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (cache[n] > 0) return cache[n];
        return cache[n] = fib_rek(n-1)+fib_rek(n-2);
    }
}