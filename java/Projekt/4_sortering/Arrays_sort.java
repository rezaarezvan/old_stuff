import java.util.*;

public class Arrays_sort
{
    public static void main(String[] args){
        int[] f�lt = new int[10];
        System.out.println("Arrays.sort()\n\n");
        for(int i=0 ; i<10 ; i++){
            f�lt[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat f�lt:\n");
        skrivUt(f�lt);
        Arrays.sort(f�lt);
        System.out.println("\n\nSorterat f�lt:\n");
        skrivUt(f�lt);
        
    }
    
    public static void skrivUt(int[] f�lt){
        for(int i=0 ; i<10 ; i++){
            System.out.print(f�lt[i]+"  ");
        }
    }
}
