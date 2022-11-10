import java.util.*;

public class Klass{
    private String id;
    private Lärare klassFöreståndare;
    private ArrayList<Elev> elevLista = new ArrayList();

    public Klass(String i, Lärare l, Skola s) {
        id = i;
        klassFöreståndare = l;
        
        // Detta gör så att så fort en klass skapas så läggs den till i skolans klass-lista
        s.setKlassLista(this);
    }

    public String toString() {
        return "\nKlass id: " + id + "\nKlassens klassföreståndare: " + klassFöreståndare.getNamn()
        + "\nLista över elever: " + elevLista + "\n";
    }

    public String toFileString() {
        return id + "\t" + klassFöreståndare.getNamn()
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