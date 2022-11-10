
import java.util.Arrays;
public class Sökning
{
    public static void main(String[] args){
        int längd = Kbd.readInt("Vi skall här demonstrera Sökning\nAnge fältets längd: ");
        int[] tal = new int[längd];
        int max = Kbd.readInt("Ange övre gräns för slumptalen: ");
        for(int i=0 ; i<tal.length ; i++){
            tal[i]=(int)(Math.random()*max)+1;
        }
        //System.out.println("\n\nOsorterat fält:\n");
        //skrivUt(tal);
        //sekSök(tal);
        sekSök(tal);
        
        
        //System.out.println("\n\nSorterat fält:\n");
        //skrivUt(tal);
        Arrays.sort(tal);
        binSök(tal);
        
    }
        
    public static void skrivUt(int[] tal){
        for(int i=0 ; i<tal.length ; i++){
            System.out.print(tal[i] + " ");
            if((i+1)%20==0){
                System.out.println();
            }
        }
    }
    
    public static void sekSök(int[] tal){
        int sökt= Kbd.readInt("\n\nVi skall nu utföra sekventiell sökning\nAnge sökt tal: ");
        boolean hittad = false;
        int plats = -1;
        for(int i=0 ; i< tal.length ; i++){
            if(tal[i]==sökt){
                hittad=true;
                plats=i;
                i=tal.length-1;
            }
        }
        if(hittad){
            System.out.println("\n" + sökt + " finns i fältet med index " + plats);
            System.out.println("Det behövdes " + (plats+1) + " \"sökningar\"");
        }
        else{
            System.out.println("\n" + sökt + " finns inte i fältet");
        }
    }
    
    public static void binSök(int[] tal){
        int min = 0;
        int max = tal.length - 1;
        int mitten;
        int t = Kbd.readInt("\n\nVi skall nu utföra binär sökning (kräver sorterat fält)\nAnge sökt tal: ");
        int pos = -1;
        int sökningar = 0;
        while(min <= max && pos == -1) {
            sökningar++;
            mitten = (max + min)/2;
            if ( t > tal[mitten]){
                min = mitten + 1;
            }
            else if (t < tal[mitten]) {
                max = mitten - 1;
            }
            else{
                pos = mitten;
            }
        }
        if (pos == -1){
            System.out.println(t + " finns inte i fältet");
        }
        else{
            System.out.println("\n" + t + " finns i fältet med index " + pos);
            System.out.println("Det behövdes " + sökningar + " \"sökningar\"");
        }
    }
}
