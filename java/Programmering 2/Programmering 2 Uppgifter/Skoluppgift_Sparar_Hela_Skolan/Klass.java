import java.util.*;

public class Klass{
    private String id;
    private L�rare klassF�rest�ndare;
    private ArrayList<Elev> elevLista = new ArrayList();

    public Klass(String i, L�rare l, Skola s) {
        id = i;
        klassF�rest�ndare = l;
        
        // Detta g�r s� att s� fort en klass skapas s� l�ggs den till i skolans klass-lista
        s.setKlassLista(this);
    }

    public String toString() {
        return "\nKlass id: " + id + "\nKlassens klassf�rest�ndare: " + klassF�rest�ndare.getNamn()
        + "\nLista �ver elever: " + elevLista + "\n";
    }

    public String toFileString() {
        return id + "\t" + klassF�rest�ndare.getNamn()
        + "\t" + print(elevLista);
    }

    // Detta f�r att slippa att toString-metoden fr�n ArrayList klassen skriver med '[' och ','

    public String print(ArrayList<Elev> e){
        String s = "";
        for(int i = 0; i < e.size(); i++) {
            s += e.get(i).toFileString();
        }

        return s;
    }

    public String getID(){
        return id;
    }

    public void setID(String i){
        id = i;
    }

    public void setElevLista(Elev e) {
        elevLista.add(e);
    }
}