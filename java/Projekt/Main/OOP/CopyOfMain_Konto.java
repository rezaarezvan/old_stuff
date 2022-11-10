
import java.io.*;

public class CopyOfMain_Konto {

    static Person[] personFält = new Person[10];
    static boolean tillåtetKontoNummer = true;
    static String[] kontoNummer = new String[10];
    static String[] personNummer = new String[10];
    static int n = personFält.length;  
    static int BankDosaNummer = 0;

    public static void main(String[] args) {

        hämtaAllt();
        personMeny();
        sparaAllt();

    }

    public static void personMeny() {
        int personIndex = 0;
        int yMeny = 1;

        while(yMeny != 3) {
            yMeny = Kbd.readInt("\nKlicka 1 för att bli en användare\nKlicka 2 för att logga in\nKlicka 3 för att avsluta");

            switch(yMeny) {

                default:
                Kbd.clearScreen();
                System.out.println("Felinmatning, försök igen");
                break;

                case 1:
                skapaAnvändare();
                break;

                case 2:
                loggaInPerson(personIndex);

                break;

                case 3:
                System.out.println("Välkommen åter!");
                break;

            }
        }
    }

    public static void kontoMeny(int personIndex) {
        int mMeny = 1;
        int kontoIndex = 0;

        while(mMeny != 4) {
            mMeny = Kbd.readInt("\nKlicka 1 för att skapa konto\nKlicka 2 för att logga in på konto\nKlicka 3 för att visa bank dosa nummeret");

            switch(mMeny) {

                default:
                Kbd.clearScreen();
                System.out.println("Felinmatning, försök igen");
                break;

                case 1:
                skapaKonto( personIndex,  kontoIndex);
                break;

                case 2:
                loggaInKonto( personIndex, kontoIndex);
                break;

                case 3:
                genereraBankDosaNummer();
                visaBankDosaNummer();
                break;

            }

        }
    }

    public static void valMeny(int personIndex,int kontoIndex) {
        int iMeny = 1;
        while(iMeny != 4) {
            System.out.println();
            iMeny = Kbd.readInt("Klicka 1 för att se ditt saldo\nKlicka 2 för att göra uttag\nKlicka 3 för insättning\nKlicka 4 för gå tillbaks till kontomenyn");
            System.out.println();

            switch(iMeny) {

                default:
                Kbd.clearScreen();
                System.out.println("Felinmatning, försök igen");
                break;

                case 1:
                personFält[personIndex].kontoFält[kontoIndex].saldoBesked();
                break;

                case 2:
                personFält[personIndex].kontoFält[kontoIndex].uttag();
                break;

                case 3:
                personFält[personIndex].kontoFält[kontoIndex].insättning();
                break;

                case 4:
                System.out.println("Går tillbaks till förra menyn...");
                break;

            }
        }
    }

    public static void hämtaAllt() {
        try {
            FileInputStream fis=new FileInputStream("sparfil_1");
            ObjectInputStream ois=new ObjectInputStream(fis);
            personFält = (Person[]) ois.readObject();
            ois.close();
        } catch (Throwable t)  {System.out.println("Går ej att hämta info"); }
    }

    public static void sparaAllt() {
        try {
            FileOutputStream fos=new FileOutputStream("sparfil_1");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(personFält);
            oos.close();
        } catch (Throwable t)  {System.out.println("Fel vid sparande"); }
    } 

    public static void loggaInPerson(int personIndex) {

        String s = Kbd.readString("\nAnge lösenord: ");
        for (int i = 0; i < n;) {
            if (personFält[i] != null && s.equals(personFält[i].getLösenord()))
            {
                personIndex = i;
                Kbd.clearScreen();
                System.out.println("Välkommen: "+personFält[personIndex].getNamn());
                kontoMeny(personIndex);
            }else
                System.out.println("Användaren finns inte tyvärr, försök igen");
            break;
        }

    }

    public static void skapaAnvändare() {
        String personNummerCheck = Kbd.readString("Ange ett personnummer");
        for (int i = 0; i< n; i++) {
            if(personNummerCheck.equals(personNummer[i]) ){
                System.out.println("Finns redan en användare med detta personnummer");
                break;
            }

            if (personFält[i] == null) {

                personFält[i] = new Person (personNummerCheck);
                personNummer[i] = personFält[i].getPersonummer();
                Kbd.clearScreen();
                break;
            }
        }   
    }

    public static void skapaKonto(int personIndex, int kontoIndex) {
        String kontoNummerCheck = Kbd.readString("Ange ett kontonummer");
        for (int i = 0; i< n; i++) {
            if(kontoNummerCheck.equals(kontoNummer[i]) ){
                System.out.println("Finns redan ett konot med detta kontonummer");
                break;
            }

            if (personFält[personIndex].kontoFält[i] == null) {
                kontoIndex = i;

                personFält[personIndex].kontoFält[i] = new Konto(kontoNummerCheck);
                genereraBankDosaNummer();
                System.out.println(genereraBankDosaNummer());
                kontoNummer[i] = personFält[personIndex].kontoFält[i].getKontonummer();
                Kbd.clearScreen();
                break;
            }
        }   
    }

    public static void loggaInKonto(int personIndex, int kontoIndex) {
        try{
            int s = Kbd.readInt("Ange bank dosans nummer: ");
            for (int i = 0; i< n;) {
                if (personFält[personIndex].kontoFält[i] != null && s == (genereraBankDosaNummer())) {

                    kontoIndex = i;
                    Kbd.clearScreen();
                    System.out.println("Välkommen: "+personFält[personIndex].kontoFält[kontoIndex].getKontonummer());
                    valMeny(personIndex,kontoIndex);

                }else
                    System.out.println("Användaren finns inte tyvärr, försök igen");
                break;
            }
        }catch(Exception e) {
            System.out.println("Kontot som du försökte logga in på finns inte, var vänligen och försök igen");
        }
    }

    public static int genereraBankDosaNummer() {

        BankDosaNummer = (int)((Math.random() * 9000000)+1000000);
        return BankDosaNummer;
    }

    public static void visaBankDosaNummer() {
        System.out.println(genereraBankDosaNummer());
    }
}
