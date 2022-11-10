import java.io.*;

public class Konto implements Serializable {

    
    private int saldo, belopp;
    private String KontoNmr;

    public Konto(String s){
        saldo = Kbd.readInt("Hur mycket saldo vill du lägga in?");
        KontoNmr = s;
        Kbd.clearScreen();
    }

    public void saldoBesked(){
        Kbd.clearScreen();
        System.out.printf("På konto: %s\nFinns det: %d kr",KontoNmr,saldo);

    }

    public void uttag(){
        Kbd.clearScreen();
        belopp = Kbd.readInt("Hur mycket vill du ta ut?");
        saldo -= belopp;

        System.out.printf("Du har nu: %d\nDu tog ut: %d kr",saldo,belopp);

    }

    public void insättning(){
        Kbd.clearScreen();
        belopp = Kbd.readInt("Hur mycket vill du sätta in?");       
        saldo += belopp;

        System.out.printf("Du har nu: %d\nDu satte in: %d kr",saldo,belopp);
    }

    public String getKontonummer(){
        return KontoNmr;
    }
}