

public class Rekursion_Summa{

    public static void main(String[] args){
        System.out.println("Nu skall vi r�kna ut summan av de n f�rsta positiva heltalen!");
        int n = Kbd.readInt("Ange n: ");
        System.out.println("\nSumman �r: " + summa(n));
    }
    
    public static int summa(int n){
        int sum = 0;
        if(n>0){
            sum = n + summa(n-1);
        }
        return sum;
    }
}
