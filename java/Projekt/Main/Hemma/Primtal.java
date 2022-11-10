public class Primtal {
    public static void main(String[] args) {
        while(true){
            System.out.println("\nMeny\n1: Mata in ett tal och få reda på om det är ett primtal");
            System.out.println("2: Skriv ut alla primtal mindre än vald maxgräns\n3: Avsluta");
            int val = Kbd.readInt("Välj ett alternativ: ");
            switch(val){
                case 1: primtal();

                break;

                case 2: ärPrimCheck();

                break;

                case 3: System.exit(0);

                break;

                default: System.out.println("\nFelaktigt alternativ, försök igen!");

            }
        }

    }

    public static void ärPrimCheck() {
        int n = Kbd.readInt("Ange en gräns: "); 
        System.out.println("Alla prim tal under " + n);
        boolean ärPrim = true;
        int antalPrim = 0;

        for(int i = 2; i < n; i++) {
            ärPrim = true;
            for(int j = 2; j <= n/2; j++) {
                if(i % j ==0 && i!=j) {
                    ärPrim = false;

                    
                }
            }

            if(ärPrim) {
                antalPrim++;
                System.out.print(i+ " ");

                if(antalPrim % 10 == 0) {
                    System.out.println("");   
                }
            }

        }
        System.out.println("");   
    }

    public static void primtal(){
        int tal=Kbd.readInt("\nAnge ett tal ");
        boolean primtal=true;
        for(int i=2;i<tal;i++){
            if(tal % i ==0 && tal!=i){
                primtal=false;
            }

        }
        if(primtal){
            System.out.println(tal + " är ett primtal!");
        }
        else{
            System.out.println(tal + " är inget primtal!");
        }
    }

}
