import java.util.Arrays;
public class T{
    public static void main(String[] args){
        int l�ngd = Kbd.readInt("Ange l�ngd p� f�ltet : ");
        String[] ordF�lt = new String[l�ngd];

        for(int i = 0; i < ordF�lt.length; i++){
            String ord = Kbd.readString("Ange ord nummer " + (i+1));
            ordF�lt[i] = ord;
        }
        System.out.print("Osorterat f�lt: ");
        for(int i = 0; i < ordF�lt.length; i++){
            System.out.print(ordF�lt[i] + ",");
        }

        System.out.print("Sorterat f�lt: ");
        
        Arrays.sort(ordF�lt);

        
        for(int i = 0; i < ordF�lt.length; i++){
            System.out.print(ordF�lt[i] + ",");
        }

        // ST�RRE �N 0
    }
}