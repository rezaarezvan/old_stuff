import java.util.Arrays; 
public class Uppgift4 {
    public static void main(String[] args) {
        int[] resultatFält = new int[30];    
        System.out.println("Provresultaten\n");
        for(int i = 0; i < 30; i++) {
            resultatFält[i] = (int) (Math.random() * 10); 
            System.out.print(resultatFält[i] + " "); 
        }
        System.out.println();
        ritaStapelDiagram(resultatFält);
    }

    public static void ritaStapelDiagram(int[] resultat) {

        for(int i = 0; i < 10; i++) { 
            System.out.println();
            System.out.print(i + ": ");
            for(int j = 0; j < 30; j++) { 
                if(resultat[j] == i) {    
                    System.out.print("*");
                }   
            }
            System.out.println();
        }

    }
}