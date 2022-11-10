import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<Lärare> lärarLista = new ArrayList();

    public Skola(String n){
        namn = n;
    }

    public String printLärare(ArrayList<Lärare> l){
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
        return "\nNamn : " + namn + "\n" + "\nKlasslista: " + printKlasser(klassLista) + "\n" + "\nLärarlista: " + printLärare(lärarLista);
    }

    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }

    public void setLärarLista(Lärare l) {
        lärarLista.add(l);
    }
}