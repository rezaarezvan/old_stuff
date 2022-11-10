package Bil;

public class BilTest {
    public static void main(String[] args) {

        Bil a = new Bil();
        Bil b = new Bil();

        /*
        a.regNummer = "32A BA2";
        a.fabrikat = "Porsche";
        a.arsModell = 2005;
        a.tjansteVikt = 1500;
        a.motorEffekt = 300;

        b.regNummer = "DA2 B32";
        b.fabrikat = "Rolls Royce";
        b.arsModell = 2019;
        b.tjansteVikt = 2600;
        b.motorEffekt = 563; 
        */

        String s = "Bil A är en " + a.fabrikat + " Den har " + a.motorEffekt +  " HESTER, årsmodellen är " + a.arsModell + " har en tjänstevikt på "
                     + a.tjansteVikt + " kg, samt regskylten är " + a.regNummer;


        String f = "Bil B är en " + b.fabrikat + " Den har " + b.motorEffekt +  " HESTER, årsmodellen är " + b.arsModell + " har en tjänstevikt på "
                     + b.tjansteVikt + " kg, samt regskylten är " + b.regNummer;
        

        System.out.println(s);

        System.out.println(f);
    }
}