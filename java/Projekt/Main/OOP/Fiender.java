import java.util.Random;

public class Fiender {
    private int fiendeHPMax, fiendeAttackMax, fiendeChansAttBlockaMax;
    private Random rand = new Random();
    private String namn;

    public Fiender(int fiendeHPMax, int fiendeAttackMax, int chansAttBlockaMax,String namn) {
        this.fiendeHPMax = fiendeHPMax;
        this.fiendeAttackMax = fiendeAttackMax;
        this.fiendeChansAttBlockaMax = chansAttBlockaMax;
        this.namn = namn;
    }

    public int attack() {
        int fiendeSkada = rand.nextInt(fiendeAttackMax);
        return fiendeSkada;
    }

    public int getHP() {
        if(fiendeHPMax <= 0) {
            fiendeHPMax = 0;
        }   
        return fiendeHPMax;
    }

    public void taSkada(int skada) {
        fiendeHPMax -= skada;
    }

    public void chansAttBlocka() {
        int fiendeChansAttBlocka = rand.nextInt(fiendeChansAttBlockaMax);
    }

    public String namn() {
        return namn;
    }
}