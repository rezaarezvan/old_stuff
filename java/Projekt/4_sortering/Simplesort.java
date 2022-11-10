

public class Simplesort
{
    public static void main(String[] args){
        int[] fält = new int[10];
        System.out.println("SIMPLESORT\n\n");
        for(int i=0 ; i<10 ; i++){
            fält[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Osorterat fält:\n");
        skrivUt(fält);
        simpleSort(fält);
        System.out.println("\n\nSorterat fält:\n");
        skrivUt(fält);
        
    }
    
    public static void simpleSort(int[] fält){
        for(int j=0 ; j<10 ; j++){
            int min = fält[j];
            int minIndex = j;
            for(int i=j ; i<10 ; i++){
                if(fält[i] < min){
                    min = fält[i];
                    minIndex = i;
                }
            }
            fält[minIndex]=fält[j];
            fält[j]=min;
        }
    }
    
    public static void skrivUt(int[] fält){
        for(int i=0 ; i<10 ; i++){
            System.out.print(fält[i]+"  ");
        }
    }
}
