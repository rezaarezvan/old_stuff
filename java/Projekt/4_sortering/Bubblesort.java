
public class Bubblesort
{
    public static void main(String[] args){
        int[] f�lt = new int[10];
        System.out.println("BUBBLESORT\n\n");
        for(int i=0 ; i<10 ; i++){
            f�lt[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat f�lt:\n");
        skrivUt(f�lt);
        bubbleSort(f�lt);
        System.out.println("\n\nSorterat f�lt:\n");
        skrivUt(f�lt);
        
    }
    
    public static void bubbleSort(int[] f�lt){
        int temp;
        for(int j=0 ; j<10 ; j++){
            for(int i=9 ; i>j ; i--){
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

