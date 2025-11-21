package Rekursion;

public class Rekursion {
    private int[] cache = new int[10000];
    private int counter = 1;
    public int fakIt(int i) {
        int ergebnis = 1;
        for (int j = 0; j < i; j++) {
            ergebnis *= i;
        }
        return ergebnis;
    }
    public int fakRek(int i) {
        if (i == 1) return 1;
        return i*fakRek(i-1);
    }
    public int fibRek(int i) {
        System.out.println(counter++);
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibRek(i-1)+fibRek(i-2);
    }
    public int fibRekOptimiert(int i) {
        System.out.println(counter++);
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (cache[i] > 0) return cache[i];
        return cache[i] = fibRekOptimiert(i-1)+fibRekOptimiert(i-2);
    }
}
