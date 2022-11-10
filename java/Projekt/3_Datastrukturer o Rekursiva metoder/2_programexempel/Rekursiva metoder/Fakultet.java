

public class Fakultet
{
     public static void main(String[] args){
        int n = Kbd.readInt("Nu skall vi räkna ut n!\n\nAnge n: ");
        //System.out.println(n + "! = " + fakultet(n));
        int prod =1;
        for(int i=1; i<= n; i++){
            prod = prod *i;
        }
        System.out.println(n + "! = " + prod);
    }
    
    public static int fakultet(int n){
        int svar = 1;
        if(n>1){
            svar = n * fakultet(n-1);
        }
        return svar;
    }
}
