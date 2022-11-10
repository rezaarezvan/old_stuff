import java.util.Arrays;
public class T{
    public static void main(String[] args){
        int längd = Kbd.readInt("Ange längd på fältet : ");
        String[] ordFält = new String[längd];

        for(int i = 0; i < ordFält.length; i++){
            String ord = Kbd.readString("Ange ord nummer " + (i+1));
            ordFält[i] = ord;
        }
        System.out.print("Osorterat fält: ");
        for(int i = 0; i < ordFält.length; i++){
            System.out.print(ordFält[i] + ",");
        }

        System.out.print("Sorterat fält: ");
        
        Arrays.sort(ordFält);

        
        for(int i = 0; i < ordFält.length; i++){
            System.out.print(ordFält[i] + ",");
        }

        // STÖRRE ÄN 0
    }
}