import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<L�rare> l�rarLista = new ArrayList();

    public Skola(String n){
        namn = n;
    }

    public String printL�rare(ArrayList<L�rare> l){
        String s = "";
        for(int i = 0; i < l.size(); i++) {
            s += l.get(i);
        }
            
        return s;
    }

    public String printKlasser(ArrayList<Klass> k){
        String s = "";
        for(int i = 0; i < k.size(); i++) {
            s += k.get(i);
        }
        
        return s;
    }

    public String toString() {
        return "\nNamn : " + namn + "\n" + "\nKlasslista: " + printKlasser(klassLista) + "\n" + "\nL�rarlista: " + printL�rare(l�rarLista);
    }

    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }

    public void setL�rarLista(L�rare l) {
        l�rarLista.add(l);
    }
}