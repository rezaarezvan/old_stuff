

public class Try5
{
    public static void main(String args[]) {
        try{
            nedr�kning();
        }catch(Throwable t){System.out.println(t);}
        int x = Kbd.readInt("Programmet forts�tter h�r utan att h�nga sig\nTryck 1 f�r att avsluta:");
    }
    
    public static void nedr�kning() throws Throwable
    {
        int tal1=5, tal2=0, kvot=-1;
        for(int i = 5 ; i>0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("BOOOM!!");

        kvot=tal1/tal2;
        
    }
}
