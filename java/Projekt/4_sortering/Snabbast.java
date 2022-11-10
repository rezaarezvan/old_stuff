import java.util.*;

public class Snabbast
{
    public static void main(String[] args){
        int[] fält = new int[80000];
        int[] fält2 = new int[80000];
        int[] fält3 = new int[80000];
        System.out.println("SNABBAST");
        for(int i=0 ; i<fält.length ; i++){
            fält[i]=(int)(Math.random()*100)+1;
            fält2[i]=fält[i];
            fält3[i]=fält[i];
        }
        
        System.out.println("\n\nSorterat fält med Bubblesort:\n");
        bubbleSort(fält);
        System.out.println("Klart!(ca 32 s)");
        
        System.out.println("\n\nSorterat fält med Simplesort:\n");
        simpleSort(fält2);
        System.out.println("Klart! (ca 12 s)");
        
        System.out.println("\n\nSorterat fält med Arrays.sort():\n");
        Arrays.sort(fält3);
        System.out.println("Klart! (ca 0 s)");
    }
    
    public static void simpleSort(int[] fält){
        for(int j=0 ; j<fält.length ; j++){
            int min = fält[j];
            int minIndex = j;
            for(int i=j ; i<fält.length ; i++){
                if(fält[i] < min){
                    min = fält[i];
                    minIndex = i;
                }
            }
            fält[minIndex]=fält[j];
            fält[j]=min;
        }
    }
    
    public static void bubbleSort(int[] fält){
        int temp;
        for(int j=0 ; j<fält.length ; j++){
            for(int i=fält.length - 1 ; i>j ; i--){
                if(fält[i] < fält[i-1]){
                    temp = fält[i];
                    fält[i] = fält[i-1];
                    fält[i-1] = temp;
                }
            }
        }
    }
    
    public static void skrivUt(int[] fält){
        for(int i=0 ; i<10 ; i++){
            System.out.print(fält[i]+"  ");
        }
    }
}
