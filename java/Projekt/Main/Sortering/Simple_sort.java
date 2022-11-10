import java.util.*;
public class  Simple_sort{
    public static void main(String[] args){
        // Längd och definiton av fält
        int LängdAvFältet = Kbd.readInt("[Ange längden för fältet]");

        int Alternativ = Kbd.readInt("\nKlicka 1 för Sortering || Klicka 2 för Sökning");

        int[] Tal = new int[LängdAvFältet];

        //Meny för sökning

        if(Alternativ == 2){

            int SökningsMetod = Kbd.readInt("\nKlicka 1 för Linjär Sökning || Klicka 2 för Binär Sökning");

            //Linjär

            if(SökningsMetod == 1){

                System.out.println("Här är fältet");

                tal_metod(Tal);

                System.out.println(" ");

                int TalSök = Kbd.readInt("Vilket tal vill du söka efter?");
                int resultat = linjär_sök(Tal, TalSök);
                if(resultat == -1) 
                    System.out.print("Talet finns inte i fältet, här är fältet : " + Arrays.toString(Tal));
                else
                    System.out.print("Talet finns på plats " + (resultat+1) );

            }

            //Binär

            if(SökningsMetod == 2){

                System.out.println("Här är det osorterade fältet");

                sortering(Tal,Alternativ);

                System.out.println(" ");

                int TalSök = Kbd.readInt("Vilket tal vill du söka efter?");

                int resultat = binär_sök(Tal, TalSök);
                if (resultat == -1) 
                    System.out.print("Talet finns inte i fältet, här är fältet : " + Arrays.toString(Tal)); 
                else
                    System.out.println("Talet finns på plats " + (resultat+1));
            }
        }

        //Anropa Simple sortering
        if(Alternativ == 1){
            sortering(Tal,Alternativ);

        }
    }

    // Metoden för att generera tal

    public static int[] tal_metod(int[] tal){
        for(int i = 0; i < tal.length; i++){
            tal[i] = (int)(Math.random()*100)+1;
            System.out.print(tal[i] + " ");
            if((i+1) % 10 == 0){
                System.out.println(" ");
            }
        } 
        return tal;
    }
    // Metod för linjär sökning
    public static int linjär_sök(int tal[], int TalSök) 
    { 
        for(int i = 0; i < tal.length; i++) 
        { 
            if(tal[i] == TalSök) 
                return i; 
        } 
        return -1; 
    } 
    // Metod för binär sökning
    public static int binär_sök(int tal[], int TalSök) 
    { 
        int första = 0, sista = tal.length - 1; 
        while (första <= sista) { 
            int mitten = första + (sista - första) / 2; 

            if (tal[mitten] == TalSök) 
                return mitten; 

            if (tal[mitten] < TalSök) 
                första = mitten + 1; 

            else
                sista = mitten - 1; 
        } 
        // Om talet inte finns
        return -1; 
    }
    // Metod för sortering
    public static void sortering(int[] tal, int Alternativ){
        if(Alternativ == 1 || Alternativ == 2){
            int temp;
            tal_metod(tal);
            System.out.println("\nEfter sortering\n");
            for(int i=0 ; i < tal.length ; i++){
                for(int j=i+1 ; j < tal.length ; j++){
                    if(tal[i] > tal[j]){
                        temp = tal[i];
                        tal[i] = tal[j];
                        tal[j] = temp;
                    }
                }
                System.out.print(tal[i] + " ");
                if((i+1) % 10 == 0){
                    System.out.println(" ");
                }
            }
        }   
    }
}                