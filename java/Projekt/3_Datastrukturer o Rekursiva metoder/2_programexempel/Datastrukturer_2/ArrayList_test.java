
import java.util.*;
public class ArrayList_test{
    public static void main(String[] args){
        System.out.println("INKÖPSLISTA\n**************");
        
        ArrayList<String> inkopslista = new ArrayList<>();

        int svar = 0;
        while(svar != 5){
             svar = Kbd.readInt("\n1. Lägg till nytt objekt\n2. Stryk objekt\n3. Töm hela listan\n4. Skriv ut listan\n5. Avsluta\n\nVälj alternativ: ");
             if(svar == 1){
                 laggTill(inkopslista);
             }else if (svar == 2){
                 stryk(inkopslista);
             }else if(svar == 3){
                 tom(inkopslista);
             }else if(svar == 4){
                 skrivUt(inkopslista);
             }else if(svar == 5){
                 System.out.println("Avslutar");
             }else{
                 System.out.println("Felaktigt alternativ!");
             }            
        }
    }
    
    public static void skrivUt(ArrayList<String> lista){
        int i = 0;
        System.out.println("");
        while(i<lista.size()){
            System.out.println(lista.get(i));
            i++;
        }
        if(i == 0){
             System.out.println("Listan är tom.");
        }
    }

    public static void laggTill(ArrayList<String> lista){
        int i = 0;
        String s = Kbd.readString("\nNy vara: ");
        while(i<lista.size()){
            if(lista.get(i).compareToIgnoreCase(s)>0){
                lista.add(i,s);
                return;
            }            
            i++;
        }  
        if(i==lista.size()){
            lista.add(s);
        }
    }
    
    public static void stryk(ArrayList<String> lista){
        String s = Kbd.readString("\nVilken vara skall strykas? ");
        lista.remove(s);
    }
    
    public static void tom(ArrayList<String> lista){
            lista.clear();
    }
}
