import java.io.*;

public class Person implements Serializable {

    private String namn;
    private String personummer;
    private String lösenord;
    public Konto[] kontoFält = new Konto[10];

    public Person(){
        namn = Kbd.readString("Ange namn: ");
        personummer = Kbd.readString("Ange personummer: ");
        lösenord = Kbd.readString("Ange ett lösenord: ");
        Kbd.clearScreen();
    }

    public void visaKonton() {
        int antal = 0;
        for(int i = 0; i < kontoFält.length; i++) {
            if(kontoFält[i] != null) {
                antal++;

            }
        }
        System.out.println("Du har: " + antal + " konton");
    }

    public String getLösenord() {
        return lösenord;
    }

    public String getNamn() {
        return namn;
    }
}