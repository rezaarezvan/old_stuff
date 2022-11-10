public class MainKonto{
    public static void main(String[] args){
        int yttreMeny = 1;
        int inreMeny = 1;
        int mellanMeny = 1;

        Konto[] konto = new Konto[10];

        //konto[0]  = new Konto(12000,"12345");
        //konto[1]  = new Konto(2000,"23456");

        while(yttreMeny == 1 || yttreMeny == 2){
            yttreMeny = Kbd.readInt("Klicka 1 för att skapa konto\nKlicka 2 för att logga in\nKlicka3 för att avsluta");
            if(yttreMeny == 1){

            }
            menyMetod(inreMeny,mellanMeny,konto);
        }

    }

    public static void menyMetod(int inreMeny, int mellanMeny,Konto[] konto){
        while(mellanMeny != 3){           
            mellanMeny = Kbd.readInt("Klicka 1 för att se ditt sparkonto\nKlicka 2 för att se ditt vanliga konto\nKlicka 3 för att avsluta programmet");
            if(mellanMeny == 1 || mellanMeny == 2){ 
                while(inreMeny != 4){
                    System.out.println();
                    inreMeny = Kbd.readInt("Klicka 1 för att se ditt saldo\nKlicka 2 för att göra uttag\nKlicka 3 för insättning\nKlicka 4 för gå tillbaks till kontomenyn");
                    System.out.println();
                    if(inreMeny == 1){
                        konto[mellanMeny-1].saldoBesked();
                    }
                    else if(inreMeny == 2){
                        konto[mellanMeny-1].uttag();
                    }
                    else if(inreMeny == 3){
                        konto[mellanMeny-1].insättning();
                    }
                    else{

                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Hejdå!");
            }
            inreMeny = 1;

        }
    }
}