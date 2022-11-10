import java.io.*;

public class Person implements Serializable{

    
    private String namn;
    private String personnummer;
    private String lösenord;
    public Konto[] kontoFält = new Konto[10];

    public Person(String pn) {
        namn = Kbd.readString("Ange namn: ");
        personnummer = pn;
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
    
    public String getPersonummer() {
        return personnummer;
    }
}