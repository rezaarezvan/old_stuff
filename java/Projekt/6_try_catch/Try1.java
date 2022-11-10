

public class Try1
{
    public static void main(String args[]) {
        int tal1=5, tal2=0, kvot=-1;
        try{
            kvot=tal1/tal2;
        }catch(Throwable t){System.out.println(t);}
        
        System.out.println("Kvoten=" + kvot);
        int x = Kbd.readInt("Programmet fortsätter här utan att hänga sig\nTryck 1 för att avsluta:");

    }
    
}
