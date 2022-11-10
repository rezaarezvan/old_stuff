
import java.util.*;
public class K�_test{  // Vanlig k�  
    public static void main(String[] args){
        System.out.println("KASSAK�\n*********");
        ArrayDeque<String> personer = new ArrayDeque<>();
        //PriorityQueue<String> personer = new PriorityQueue<>();
        int svar = 0;
        while(svar != 4){
            svar = Kbd.readInt("\n1. L�gg till person\n2. Expediera\n3. Visa k�l�ngd\n4. Avsluta\n\nV�lj alternativ: ");
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
            System.out.println("\nK�n �r tom.");
        }
        else{
            System.out.println("\nK�ns l�ngd: " + personer.size() + " personer.");
        }
    }

    public static void laggTill(ArrayDeque<String> personer){
        String s = Kbd.readString("\nNy person: ");
        personer.offer(s);
    }

    public static void exped(ArrayDeque<String> personer){
        if(personer.isEmpty()){
            System.out.println("\nK�n �r tom.");
        }
        else{
            System.out.println("\n" + personer.poll() + " expedieras.");
        }        
    }
}
