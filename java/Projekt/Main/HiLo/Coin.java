public class Coin{
    public static void main(String [] args){
        int klave = 0;
        int krona = 0;
        for(int i = 0; i < 100; i++){
            int tal = (int) (Math.random() * 2) + 1;
            if ( (i % 10) == 0){
                System.out.println(" ");
            }
            if (tal == 1 ){
                System.out.print("Du fick Klave! ");
                klave++;
            }
            else{
                System.out.print("Du fick Krona! ");
                krona++;
            }
        }
        System.out.println("\n\nDu fick total " + klave + " klave och " + krona + " kronor!");
    }
}

