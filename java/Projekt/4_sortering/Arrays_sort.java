import java.util.*;

public class Arrays_sort
{
    public static void main(String[] args){
        int[] fält = new int[10];
        System.out.println("Arrays.sort()\n\n");
        for(int i=0 ; i<10 ; i++){
            fält[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat fält:\n");
        skrivUt(fält);
        Arrays.sort(fält);
        System.out.println("\n\nSorterat fält:\n");
        skrivUt(fält);
        
    }
    
    public static void skrivUt(int[] fält){
        for(int i=0 ; i<10 ; i++){
            System.out.print(fält[i]+"  ");
        }
    }
}
