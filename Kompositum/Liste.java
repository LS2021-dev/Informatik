public class Liste
{
    private Listenelement erster;

    public Liste() {
        erster = new Abschluss();
    }

    public void einfuegen (String s){
        einfuegen(new Datenelement(s));
    }

    public void einfuegen (Datenelement de) {
        erster = erster.einfuegen(de);
    }

    public void sortiertEinfuegen (String s) {
        sortiertEinfuegen(new Datenelement(s));
    }

    public void sortiertEinfuegen (Datenelement de){
        erster = erster.sortiertEinfuegen(de);
    }

    public void vorneEinfuegen (String s) {
        vorneEinfuegen(new Datenelement(s));
    }

    public void vorneEinfuegen (Datenelement de) {
        erster = new Datenknoten(de, erster);
    }

    public int laengeBestimmen() {
        return erster.laengeBestimmen();
    }

    public Datenelement entnehmen(){
        Datenelement ergebnis = erster.gibInhalt();
        erster = erster.gibNaechster();
        return ergebnis;
    }

    public Datenelement erstesSuchen(String s) {
        return erstesSuchen(new Datenelement(s));
    }

    public Datenelement erstesSuchen(Datenelement de) {
        return erster.erstesSuchen(de);
    }

    public void entfernen(String s) {
        entfernen(new Datenelement(s));
    }

    public void entfernen(Datenelement de) {
        erster.entfernen(de);
    }
    
    public Liste multiSuche(String s) {
        return multiSuche(new Datenelement(s));
    }

    public Liste multiSuche(Datenelement de) {
        Liste ergebnisListe = new Liste();
        return erster.multiSuche(de, ergebnisListe);
    }

    public void listeDrucken() {
        erster.listeDrucken();
    }
}
