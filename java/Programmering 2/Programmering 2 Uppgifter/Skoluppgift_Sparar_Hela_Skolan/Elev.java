public class Elev{

    private String namn;
    private String klassId;

    public Elev(String n, Klass k){
        namn = n;
        klassId = k.getID();
        
        // Detta gör så att så fort en klass skapas så läggs den till i klassens elev-lista
        k.setElevLista(this);
    }

    public String toString() {
        return namn;
    }

    public String toFileString() {
        return namn + "\t";
    }
}