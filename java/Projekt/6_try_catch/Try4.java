

public class Try4{
    public static void main(String args[]) {
        int tal1=5, tal2=0, kvot=-1;
        int [] lista={8,3,9,1}; 
        try{
            for(int i = 10 ; i>0 ; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("BOOOM!!");
            lista[4]=47;
            kvot=tal1/tal2;        
        }
        catch(ArithmeticException t){
            System.out.println("Man f�r EJ dela med 0!!");
        }
        catch(ArrayIndexOutOfBoundsException t){
            System.out.println("Otill�tet index!!");
        }
         catch(Throwable u){
            System.out.println(u);
        }
            
        System.out.println("Kvoten=" + kvot);
        int x = Kbd.readInt("Programmet forts�tter h�r utan att h�nga sig\nTryck 1 f�r att avsluta:");
    }
}
