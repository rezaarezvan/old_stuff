
import java.util.*;
public class Kö_test{  // Vanlig kö  
    public static void main(String[] args){
        System.out.println("KASSAKÖ\n*********");
        ArrayDeque<String> personer = new ArrayDeque<>();
        //PriorityQueue<String> personer = new PriorityQueue<>();
        int svar = 0;
        while(svar != 4){
            svar = Kbd.readInt("\n1. Lägg till person\n2. Expediera\n3. Visa kölängd\n4. Avsluta\n\nVälj alternativ: ");
            if(svar == 1){
                laggTill(personer);
            }else if (svar == 2){
                exped(personer);
            }else if(svar == 3){
                skrivUt(personer);
            }else if(svar == 4){
                System.out.println("Avslutar");
            }else{
                System.out.println("Felaktigt alternativ!");
            }             
        }
    }

    public static void skrivUt(ArrayDeque<String> personer){
        if(personer.isEmpty()){
            System.out.println("\nKön är tom.");
        }
        else{
            System.out.println("\nKöns längd: " + personer.size() + " personer.");
        }
    }

    public static void laggTill(ArrayDeque<String> personer){
        String s = Kbd.readString("\nNy person: ");
        personer.offer(s);
    }

    public static void exped(ArrayDeque<String> personer){
        if(personer.isEmpty()){
            System.out.println("\nKön är tom.");
        }
        else{
            System.out.println("\n" + personer.poll() + " expedieras.");
        }        
    }
}
