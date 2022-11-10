
public class Bubblesort
{
    public static void main(String[] args){
        int[] fält = new int[10];
        System.out.println("BUBBLESORT\n\n");
        for(int i=0 ; i<10 ; i++){
            fält[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat fält:\n");
        skrivUt(fält);
        bubbleSort(fält);
        System.out.println("\n\nSorterat fält:\n");
        skrivUt(fält);
        
    }
    
    public static void bubbleSort(int[] fält){
        int temp;
        for(int j=0 ; j<10 ; j++){
            for(int i=9 ; i>j ; i--){
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

