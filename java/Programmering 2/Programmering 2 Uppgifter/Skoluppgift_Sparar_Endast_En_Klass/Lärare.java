public class Lärare{

    private String fNamn;
    private String eNamn;

    public Lärare(String f, String e, Skola s) {
        fNamn = f;
        eNamn = e;

        s.setLärarLista(this);
    }
    
    
    public Lärare(String f, String e) {
        fNamn = f;
        eNamn = e;
    }

    public String toString() {
        return "\nLärarens förnamn: " + fNamn + " \nLärarens efternamn: " + eNamn + "\n";
    }

    public String getfNamn() {

        return fNamn;

    }

    public String geteNamn() {

        return eNamn;

    }
}