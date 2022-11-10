    import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<Lärare> lärarLista = new ArrayList();

    public Skola(String textFromFile) {
        String [] parts = textFromFile.split("\t");

        namn = parts[0];
        
         
        /* Yttre loopen för att kolla igenom hela fältet
         * Den innre för att mata in alla elever eftersom det är som en sub-fält
         */
        for(int i = 0; i < parts.length; i++) {
            if(parts[i].contains("KlassID")) {
                Lärare l = new Lärare(parts[i+1], this);
                Klass k = new Klass(parts[i], l, this);

                /* vi har b-variablen här för att vi måste använda j från 0 för att få alla
                 * element i 'sub-fältet'
                */
               
                int b = i;
                for(int j = 0; j < parts.length; j++) {
                    // Här kollar vi, ifall vi stöter på en tom klass eller slutet av klassListans toString och början av lärarListan
                    if(parts[b+2].contains("KlassID") || (parts[b+2].isEmpty())){
                        continue;
                    }
                    else{
                        Elev e = new Elev(parts[b+2], k);
                        b++;
                    }
                }
                
            }
        }
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

    public String printToFileLärare(ArrayList<Lärare> l){
        String s = "";
        for(int i = 0; i < l.size(); i++) {
            s += l.get(i).toFileString();
        }

        return s;
    }

    public String printToFileKlasser(ArrayList<Klass> k){
        String s = "";
        for(int i = 0; i < k.size(); i++) {
            s += k.get(i).toFileString();
        }

        return s;
    }

    public String toString() {
        return "\nNamn : " + namn + "\n" + "\nKlasslista: " + printKlasser(klassLista) + "\n" + "\nLärarlista: " + printLärare(lärarLista);
    }
    

    public String toFileString() {
        return namn + "\t" + printToFileKlasser(klassLista) + "\t" + printToFileLärare(lärarLista);
    }

    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }

    public void setLärarLista(Lärare l) {
        lärarLista.add(l);
    }
}