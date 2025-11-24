
public class Datenelement extends Tools
{
    public String name;
    public String compareMode = "EQUAL_TEXT";
    
    public Datenelement(String s){
        name = s;
    }

    public void druckeDich(){
        schreibe(name);
    }

    public boolean istKleiner(Datenelement de) {
        return (name.compareTo(de.name) < 0); // Lexikalisch sorieren --> A, B, C
    }

    public boolean istGleich(Datenelement de) {
        switch (compareMode) {
            case "EQUAL_TEXT":
                return (name.equals(de.name)); // == fehleranfällig in Java --> equals oder compareTo
            case "SAME_LENGTH":
                return (name.length() == de.name.length());
            case "EQUAL_FIRST_LETTER":
                return (name.charAt(0) == de.name.charAt(0));
            default:
                return false;
        }
    }

}
