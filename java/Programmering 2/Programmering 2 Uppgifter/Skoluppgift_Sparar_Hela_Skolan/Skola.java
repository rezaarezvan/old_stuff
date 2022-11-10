    import java.util.*;

public class Skola{
    private String namn;
    private ArrayList<Klass> klassLista = new ArrayList();
    private ArrayList<L�rare> l�rarLista = new ArrayList();

    public Skola(String textFromFile) {
        String [] parts = textFromFile.split("\t");

        namn = parts[0];
        
         
        /* Yttre loopen f�r att kolla igenom hela f�ltet
         * Den innre f�r att mata in alla elever eftersom det �r som en sub-f�lt
         */
        for(int i = 0; i < parts.length; i++) {
            if(parts[i].contains("KlassID")) {
                L�rare l = new L�rare(parts[i+1], this);
                Klass k = new Klass(parts[i], l, this);

                /* vi har b-variablen h�r f�r att vi m�ste anv�nda j fr�n 0 f�r att f� alla
                 * element i 'sub-f�ltet'
                */
               
                int b = i;
                for(int j = 0; j < parts.length; j++) {
                    // H�r kollar vi, ifall vi st�ter p� en tom klass eller slutet av klassListans toString och b�rjan av l�rarListan
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

    public String printToFileL�rare(ArrayList<L�rare> l){
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
        return "\nNamn : " + namn + "\n" + "\nKlasslista: " + printKlasser(klassLista) + "\n" + "\nL�rarlista: " + printL�rare(l�rarLista);
    }
    

    public String toFileString() {
        return namn + "\t" + printToFileKlasser(klassLista) + "\t" + printToFileL�rare(l�rarLista);
    }

    public void setKlassLista(Klass l) {
        klassLista.add(l);
    }

    public void setL�rarLista(L�rare l) {
        l�rarLista.add(l);
    }
}