import java.util.*;
public class Uppgift2{
    public static void main(String[] args) {
        int[] tal = new int[19];
        int n = tal.length;

        for(int i = 0; i < n; i++) {
            tal[i] = (int) (Math.random() * 10) +1; 
            System.out.print(tal[i] + " ");
        }
        System.out.println();
        medelvärde(tal);
        System.out.println();
        medianen(tal);
    }

    public static void medelvärde(int[] tal) {
        double summa = 0;
        for(int i = 0; i < tal.length; i++){
            summa += tal[i];
        }
        double medelvärde = (summa/(double)tal.length);
        System.out.printf("Medelväret är: " + "%.2f", medelvärde);
    }

    public static void medianen(int[] tal) {
        Arrays.sort(tal);
        
        int medianen = tal[tal.length/2];
        System.out.println("Medianen är: " + medianen);
    }
}