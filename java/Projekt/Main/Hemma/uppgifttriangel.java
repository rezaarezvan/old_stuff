public class uppgifttriangel{
    public static void main(String[] args){
        int höjd = Kbd.readInt("Hur hög ska din rektangel vara");
        int bas= Kbd.readInt("Hur lång ska din bas vara");
        System.out.println();
        int te = bas*2-2;
        int ho = höjd-2;
        int räknare = 0;
        for(int i = 0; i < bas ; i++){

            System.out.print("* ");
        }
        
        for(int i = 1 ; i < höjd ; i++){
            System.out.print("\n*");
            if(räknare == ho){
                break;
            }
            else{
                for(int j = 1 ; j < te ; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                räknare++;
            }
        }
        
        for(int i = 1 ; i < bas ; i++){
            System.out.print(" *");
        }

    }
}