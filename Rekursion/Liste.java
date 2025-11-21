

public class Liste
{
    private Datenknoten erster;
    
    public void einfuegen (String s){
        Datenelement de = new Datenelement(s);
        
        if (erster == null){
            erster = new Datenknoten(de);
        }else{
            erster.einfuegen(de);
    }
}
public void listeDrucken(){
    if (erster != null) erster.listeDrucken();
}
}
