

public class Datenknoten
{
    private Datenknoten naechster;
    private Datenelement inhalt;
    
    public Datenknoten (Datenelement de){
        inhalt = de;
        naechster = null;
    }
   
    public void einfuegen(Datenelement de){
        
     if (naechster == null){
         naechster = new Datenknoten(de);
        
     }else{
         naechster.einfuegen(de);
     }
    }
    
    public void listeDrucken(){
        inhalt.druckeDich();
            if (naechster != null) naechster.listeDrucken();
        }
    }

