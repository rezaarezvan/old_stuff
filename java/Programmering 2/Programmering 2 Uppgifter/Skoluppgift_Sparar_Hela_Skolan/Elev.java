public class Elev{

    private String namn;
    private String klassId;

    public Elev(String n, Klass k){
        namn = n;
        klassId = k.getID();
        
        // Detta g�r s� att s� fort en klass skapas s� l�ggs den till i klassens elev-lista
        k.setElevLista(this);
    }

    public String toString() {
        return namn;
    }

    public String toFileString() {
        return namn + "\t";
    }
}