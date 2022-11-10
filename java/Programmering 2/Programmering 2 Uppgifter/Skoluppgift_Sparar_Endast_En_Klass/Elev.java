public class Elev{
    
    private String namn;
    private String klassId;
    
    public Elev(String n, Klass k){
        namn = n;
        klassId = k.getID();
        
        k.setElevLista(this);
    }
    
    
      
    public String toString() {
        return namn;
    }
    
    public String toFileString() {
        return namn + "\t";
    }
}