public class L�rare{

    private String fNamn;
    private String eNamn;

    public L�rare(String f, String e, Skola s) {
        fNamn = f;
        eNamn = e;

        s.setL�rarLista(this);
    }
    
    
    public L�rare(String f, String e) {
        fNamn = f;
        eNamn = e;
    }

    public String toString() {
        return "\nL�rarens f�rnamn: " + fNamn + " \nL�rarens efternamn: " + eNamn + "\n";
    }

    public String getfNamn() {

        return fNamn;

    }

    public String geteNamn() {

        return eNamn;

    }
}