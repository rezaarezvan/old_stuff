public class Lärare{

    private String namn;

    public Lärare(String n, Skola s) {
        namn = n;

        // Detta gör så att så fort en klass skapas så läggs den till i skolans lärar-lista
        s.setLärarLista(this);
    }

    public String toString() {
        return "\nLärarens namn: " + namn + "\n";
    }
    
    public String toFileString() {
        return namn + "\t";
    }
    
    public String getNamn() {
        return namn;
    }
}