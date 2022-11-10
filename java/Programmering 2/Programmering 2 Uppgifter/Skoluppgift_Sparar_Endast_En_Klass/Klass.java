import java.util.*;

public class Klass{
    private String id;
    private L�rare klassF�rest�ndare;
    private ArrayList<Elev> elevLista = new ArrayList();


    public Klass(String i, L�rare l, Skola s) {
        id = i;
        klassF�rest�ndare = l;

        s.setKlassLista(this);
    }

    // Konstruktorn f�r att skapa Klass-objekten fr�n text-filen

    public Klass(String textFromFile) {
        String [] parts = textFromFile.split("\t");

        id = parts[0];
        klassF�rest�ndare = new L�rare(parts[1],parts[2]);

        for(int i = 3; i < parts.length; i++) {
            if(parts[i].equals("")) {
                continue;
            }
            else{
                Elev e = new Elev(parts[i], this);
            }
        }

    }

    public String toString() {
        return "\nKlass id: " + id + "\nKlassens klassf�rest�ndare: " + klassF�rest�ndare.getfNamn() + " " + klassF�rest�ndare.geteNamn() 
        + "\nLista �ver elever: " + elevLista + "\n";
    }

    public String toFileString() {
        return id + "\t" + klassF�rest�ndare.getfNamn() + "\t" + klassF�rest�ndare.geteNamn() 
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