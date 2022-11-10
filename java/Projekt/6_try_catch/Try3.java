
public class Try3
{
    public static void main(String args[]) {
        int [] lista={8,3,9,1}; // index 0 tom 3
        try{
            lista[4]=47;
        }catch(Throwable t){
            System.out.println("FEL INDEX!!");
            System.out.println(t);
        }
        
        int x = Kbd.readInt("Programmet fortsätter här utan att hänga sig\nTryck 1 för att avsluta:");
    }
    
}
