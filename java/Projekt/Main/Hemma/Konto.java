public class Konto{

    private int saldo;
    private String KontoNmr;
    private int belopp;

    public Konto(int s, String Knmr){
        saldo = s;
        KontoNmr = Knmr;
    }

    public void saldoBesked(){

        System.out.println("På konto: " + KontoNmr + "\nFinns det: " + saldo + " kr");

    }

    public void uttag(){
        System.out.println();
        belopp = Kbd.readInt("Hur mycket vill du ta ut?");
        saldo -= belopp;
        System.out.println("Du har nu: " + saldo + "\nDu tog ut: " + belopp + " kr");
    }

    public void insättning(){
        System.out.println();
        belopp = Kbd.readInt("Hur mycket vill du sätta in?");       
        saldo += belopp;
        System.out.println("Du har nu: " + saldo + "\nDu satte in: " + belopp + " kr");
    }

}