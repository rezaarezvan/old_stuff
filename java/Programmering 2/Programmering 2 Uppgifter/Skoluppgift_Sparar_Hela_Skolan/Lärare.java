public class L�rare{

    private String namn;

    public L�rare(String n, Skola s) {
        namn = n;

        // Detta g�r s� att s� fort en klass skapas s� l�ggs den till i skolans l�rar-lista
        s.setL�rarLista(this);
    }

    public String toString() {
        return "\nL�rarens namn: " + namn + "\n";
    }
    
    public String toFileString() {
        return namn + "\t";
    }
    
    public String getNamn() {
        return namn;
    }
}