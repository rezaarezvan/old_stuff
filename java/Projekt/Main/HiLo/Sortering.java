import java.util.Arrays;

public class Sortering {
    public static void main(String [] args) {
        int längd_tal = Kbd.readInt("Angle fältens längd");
        int tal [] = new int[längd_tal];

        int lägsta = 0;
        int högsta = tal.length-1;

        

        for(int i=0 ; i < tal.length ; i++) {
            tal[i] = (int)(Math.random()*100)+1;

        }
        
        System.out.println(Arrays.toString(tal));
        
        for(int rad : tal){
            //System.out.print(tal[i]+" ");
            if((rad+1) % 25 == 0){
                System.out.print("");
            }
        }
        quickSortera(tal,lägsta,högsta);
        System.out.println("Efter sortering..\n");
        System.out.println(Arrays.toString(tal));

        /*int plats = 1;
        int max = tal[0];
        for(int i=0 ; i < tal.length ; i++){
        if(tal[i] < max){
        max = tal[i];
        plats = i+1;
        }
        }*/
        //System.out.println("\nDet minsta talet är "+ max +" och finns på plats "+ plats);
    }

    public static void quickSortera(int tal [], int lägsta, int högsta) {
        if (tal == null || tal.length == 0)
            return;

        if (lägsta >= högsta)
            return;

        // pick the pivot
        int mitten = lägsta + (högsta - lägsta) / 2;
        int pivot = tal[mitten];

        // make left < pivot and right > pivot
        int i = lägsta, j = högsta;
        while (i <= j) {
            while (tal[i] < pivot) {
                i++;
            }

            while (tal[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = tal[i];
                tal[i] = tal[j];
                tal[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (lägsta < j)
            quickSortera(tal, lägsta, j);

        if (högsta > i)
            quickSortera(tal, i, högsta);
    }
}
