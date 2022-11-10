import java.util.*;

public class Klass{
    private String id;
    private Lärare klassFöreståndare;
    private ArrayList<Elev> elevLista = new ArrayList();


    public Klass(String i, Lärare l, Skola s) {
        id = i;
        klassFöreståndare = l;

        s.setKlassLista(this);
    }

    // Konstruktorn för att skapa Klass-objekten från text-filen

    public Klass(String textFromFile) {
        String [] parts = textFromFile.split("\t");

        id = parts[0];
        klassFöreståndare = new Lärare(parts[1],parts[2]);

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
        return "\nKlass id: " + id + "\nKlassens klassföreståndare: " + klassFöreståndare.getfNamn() + " " + klassFöreståndare.geteNamn() 
        + "\nLista över elever: " + elevLista + "\n";
    }

    public String toFileString() {
        return id + "\t" + klassFöreståndare.getfNamn() + "\t" + klassFöreståndare.geteNamn() 
        + "\t" + print(elevLista);
    }

    // Detta för att slippa att toString-metoden från ArrayList klassen skriver med '[' och ','

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