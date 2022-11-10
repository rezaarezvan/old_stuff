import java.util.Random;

public class Main {

    static Spelare spelare = new Spelare(100,50,5); // HP, Attack, % Block
    static Fiender[] fiender = new Fiender[3];
    static boolean kör = true; 
    static Random rand = new Random();
    static int antalPotions = 3;

    public static void main(String[] args) {

        fiender[0] = new Fiender(25,30,1,"Skelett"); // Skelett
        fiender[1] = new Fiender(10,20,0,"Goblin"); // Goblin
        fiender[2] = new Fiender(50,50,50,"Ogre"); // Ogre

        System.out.println("Välkommen till DA DUNGEON MON");
        int valdFiende = rand.nextInt(fiender.length);
        System.out.println("En "+ fiender[valdFiende].namn() + " kommer fram!");
        while(kör) {

            System.out.println("------------------------------------------------");

            int val = Kbd.readInt("Klicka 1 för att attackera\nKlicka 2 för blockera\n" +
                    "Klicka 3 för att ta en potion\nKlicka 4 för att fly");

            if(val == 1) {
                Kbd.clearScreen();

                fiender[valdFiende].taSkada(spelare.attack());
                System.out.println("\nFienden har nu " + fiender[valdFiende].getHP() + " HP"); 
                if(fiender[valdFiende].getHP() <= 0) {
                    System.out.println("Du dödade fienden!\nGrattis!");
                    kör = false;       
                    break;
                } 
                else if(spelare.getHP() <= 0) {
                    System.out.println("Du var modig, men du dog tyvärr :( GAME OVER");
                    kör = false;
                    break;
                }
                spelare.taSkada(fiender[valdFiende].attack());
                System.out.println("\n" + fiender[valdFiende].namn() + " Attackerar dig " + " Du har nu " + spelare.getHP());

            }
            else if(val == 2) {
                if(spelare.Blocka() == -1) {
                    Kbd.clearScreen();
                    spelare.taSkada(fiender[valdFiende].attack());
                    if(fiender[valdFiende].getHP() <= 0) {
                        System.out.println("Du dödade fienden!\nGrattis!");
                        kör = false;
                        break;
                    } 
                    else if(spelare.getHP() <= 0) {
                        System.out.println("Du var modig, men du dog tyvärr :( GAME OVER");
                        kör = false;
                        break;
                    }
                    System.out.println(fiender[valdFiende].namn() + " slår dig, du har nu " + spelare.getHP());
                    System.out.println("Du har nu "+ spelare.getHP() + " HP");

                }
                else {
                    Kbd.clearScreen();
                    System.out.println("Du dodgear som en gud!");
                    System.out.println("Du har nu "+ spelare.getHP() + " HP");
                }
            }
            else if(val == 3) {
                Kbd.clearScreen();
                if(antalPotions > 0){
                    spelare.fåHP(15);
                    antalPotions = antalPotions -1;
                    spelare.taSkada(fiender[valdFiende].attack());
                    System.out.println(fiender[valdFiende].namn() + " Slår dig hårt som fan");
                    System.out.println("Du har nu "+ spelare.getHP() + " HP");
                }
                else if(antalPotions <= 0){
                    System.out.println("Du letar i väskan efter en potion, men hittar inget, lmao nu kommer fienden att slå dig retard");
                    spelare.taSkada(fiender[valdFiende].attack());
                    System.out.println(fiender[valdFiende].namn() + " Slår dig hårt som fan");
                    System.out.println("Du har nu "+ spelare.getHP() + " HP");
                }


            }
            else if(val == 4) {
                Kbd.clearScreen();
                int chansAttFly = rand.nextInt(100);
                if(chansAttFly <= 25) {
                    Kbd.clearScreen();
                    kör = false;
                    System.out.println("Pussy, du sprang, aja");
                } 
                else {
                    System.out.println("Du misslyckades med att fly, lmao sämst");
                    spelare.taSkada(fiender[valdFiende].attack());
                    System.out.println(fiender[valdFiende].namn() + " Slår dig hårt som fan");
                    System.out.println("Du har nu "+ spelare.getHP() + " HP");
                }
            }
        }
    }
}