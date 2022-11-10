

public class Try5
{
    public static void main(String args[]) {
        try{
            nedräkning();
        }catch(Throwable t){System.out.println(t);}
        int x = Kbd.readInt("Programmet fortsätter här utan att hänga sig\nTryck 1 för att avsluta:");
    }
    
    public static void nedräkning() throws Throwable
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
