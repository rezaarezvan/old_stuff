

public class Rekursion_Summa{

    public static void main(String[] args){
        System.out.println("Nu skall vi räkna ut summan av de n första positiva heltalen!");
        int n = Kbd.readInt("Ange n: ");
        System.out.println("\nSumman är: " + summa(n));
    }
    
    public static int summa(int n){
        int sum = 0;
        if(n>0){
            sum = n + summa(n-1);
        }
        return sum;
    }
}
