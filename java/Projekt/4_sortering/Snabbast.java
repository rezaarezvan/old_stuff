import java.util.*;

public class Snabbast
{
    public static void main(String[] args){
        int[] f�lt = new int[80000];
        int[] f�lt2 = new int[80000];
        int[] f�lt3 = new int[80000];
        System.out.println("SNABBAST");
        for(int i=0 ; i<f�lt.length ; i++){
            f�lt[i]=(int)(Math.random()*100)+1;
            f�lt2[i]=f�lt[i];
            f�lt3[i]=f�lt[i];
        }
        
        System.out.println("\n\nSorterat f�lt med Bubblesort:\n");
        bubbleSort(f�lt);
        System.out.println("Klart!(ca 32 s)");
        
        System.out.println("\n\nSorterat f�lt med Simplesort:\n");
        simpleSort(f�lt2);
        System.out.println("Klart! (ca 12 s)");
        
        System.out.println("\n\nSorterat f�lt med Arrays.sort():\n");
        Arrays.sort(f�lt3);
        System.out.println("Klart! (ca 0 s)");
    }
    
    public static void simpleSort(int[] f�lt){
        for(int j=0 ; j<f�lt.length ; j++){
            int min = f�lt[j];
            int minIndex = j;
            for(int i=j ; i<f�lt.length ; i++){
                if(f�lt[i] < min){
                    min = f�lt[i];
                    minIndex = i;
                }
            }
            f�lt[minIndex]=f�lt[j];
            f�lt[j]=min;
        }
    }
    
    public static void bubbleSort(int[] f�lt){
        int temp;
        for(int j=0 ; j<f�lt.length ; j++){
            for(int i=f�lt.length - 1 ; i>j ; i--){
                if(f�lt[i] < f�lt[i-1]){
                    temp = f�lt[i];
                    f�lt[i] = f�lt[i-1];
                    f�lt[i-1] = temp;
                }
            }
        }
    }
    
    public static void skrivUt(int[] f�lt){
        for(int i=0 ; i<10 ; i++){
            System.out.print(f�lt[i]+"  ");
        }
    }
}
