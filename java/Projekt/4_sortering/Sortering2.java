
import java.util.*;
public class Sortering2{
    public static void main(String[] args){
        int[] vektor = new int[40000];
        int[] vektor2 = new int[40000];
        int[] vektor3 = new int[40000];
        vektorSlump(vektor,vektor2,vektor3);
        System.out.print("\n\nSimpleSort: ");
        System.out.println(simpleSort(vektor));
        System.out.print("\n\nBubbleSort: ");
        System.out.println(bubbelSort(vektor2));
        System.out.print("\n\nArrays.sort(): ");
        double tid1 = new Date().getTime();
        Arrays.sort(vektor3);
        double tid2 = new Date().getTime();
        System.out.println(tid2 - tid1);
        System.out.println("\n\n\n\n");
    }
   
    
     public static void vektorSlump(int vektor[], int vektor2[], int vektor3[]){
         
        int storlek = vektor.length;
        
        for(int nr= 0 ; nr < storlek ; nr++){
            vektor[nr] = (int) (1+Math.random()*100);
            vektor2[nr] = vektor[nr];
            vektor3[nr] = vektor[nr];
        }
    }
    
    public static void vektorVisning(int vektor[]){
        
        int storlek = vektor.length;
        
         System.out.println();
        for(int nr= 0 ; nr < storlek ; nr++){
            System.out.print(vektor[nr]+ " ");
        }
        System.out.println(" ");
    }
    
        
     
      
      
      public static double bubbelSort(int vektor[]){
        double t1 = new Date().getTime();
        int storlek = vektor.length - 1;
        
        for( int m = 0 ; m < storlek ; m++ ){
                for( int n = storlek   ; n > m  ; n-- ){
                    if(vektor[n] < vektor[n-1]){
                        int temp = vektor[n-1];
                        vektor[n-1]= vektor[n];
                        vektor[n]= temp;
                    }
                }
        }
        double t2 = new Date().getTime();
        return (t2 - t1);
     }   
    
    public static double simpleSort(int data[]){
        double t1 = new Date().getTime();
        int antal = data.length;
        
        for( int m = 0; m < antal; m++){
            int index= 0, min = data[m];
                for( int n = m+1; n < antal ; n++ ){
                    if(data[n] < min){
                        min = data[n];
                        index = n;
                    }
                }
                if(min < data[m]){
                    int temp = data[m];
                    data[m] = min;
                    data[index] =temp;
                }
        }
        double t2 = new Date().getTime();
        return (t2 - t1);
    }

}