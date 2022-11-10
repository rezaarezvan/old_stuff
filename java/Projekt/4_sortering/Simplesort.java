

public class Simplesort
{
    public static void main(String[] args){
        int[] f�lt = new int[10];
        System.out.println("SIMPLESORT\n\n");
        for(int i=0 ; i<10 ; i++){
            f�lt[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat f�lt:\n");
        skrivUt(f�lt);
        simpleSort(f�lt);
        System.out.println("\n\nSorterat f�lt:\n");
        skrivUt(f�lt);
        
    }
    
    public static void simpleSort(int[] f�lt){
        for(int j=0 ; j<10 ; j++){
            int min = f�lt[j];
            int minIndex = j;
            for(int i=j ; i<10 ; i++){
                if(f�lt[i] < min){
                    min = f�lt[i];
                    minIndex = i;
                }
            }
            f�lt[minIndex]=f�lt[j];
            f�lt[j]=min;
        }
    }
    
    public static void skrivUt(int[] f�lt){
        for(int i=0 ; i<10 ; i++){
            System.out.print(f�lt[i]+"  ");
        }
    }
}
