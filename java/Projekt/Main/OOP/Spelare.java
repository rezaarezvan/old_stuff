import java.util.Random;

public class Spelare {

    private int spelareHPMax, spelareAttackMax, spelareChansAttBlockaMax;
    private Random rand = new Random();

    public Spelare(int spelareHPMax, int spelareAttackMax, int spelareChansAttBlockaMax) {
        this.spelareHPMax = spelareHPMax;
        this.spelareAttackMax = spelareAttackMax;
        this.spelareChansAttBlockaMax = spelareChansAttBlockaMax;
    }

    public int attack() {
        int spelareSkada = rand.nextInt(spelareAttackMax);
        return spelareSkada;
    }

    public int getHP() {
        if(spelareHPMax <= 0) {
            System.out.println("Du dog!");

            spelareHPMax = 0;
        }   
        return spelareHPMax;
    }
    
    public void fåHP(int HPfrånPotion) {
        spelareHPMax += HPfrånPotion;
    }

    public void taSkada(int skada) {
        spelareHPMax -= skada;
    }

    public int Blocka() {
        int resultat = -1;
        int spelareChansAttBlocka = rand.nextInt(spelareChansAttBlockaMax);
        int block = rand.nextInt(spelareChansAttBlockaMax);
        if(block == spelareChansAttBlocka) {
            System.out.println("Du blockade!");
            return resultat = 1;
        } else {
            System.out.println("Du misslyckades med att blocka");
            return resultat;
        }
    }
}