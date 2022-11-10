import java.io.*;

public class Main{
    public static void main(String[] args) {

        Skola skola = new Skola("Huleb�ck");

        L�rare L�rareA = new L�rare("Lars H�kansson", skola);
        L�rare L�rareB = new L�rare("Kalle Bengtsson", skola);
        L�rare L�rareC = new L�rare("Erik Ek", skola);

        Klass Aklassen = new Klass("KlassID-20", L�rareA, skola);
        Klass Bklassen = new Klass("KlassID-21", L�rareB, skola);
        Klass Cklassen = new Klass("KlassID-22", L�rareC, skola);

        Elev ElevA = new Elev("Erik Johannson" ,     Aklassen);
        Elev ElevB = new Elev("Johan Johannson",     Bklassen);
        Elev ElevC = new Elev("Jon Johannson"  ,     Cklassen);
        Elev ElevD = new Elev("Reza Rezvan"    ,     Aklassen);
        Elev ElevF = new Elev("Reza Rezvan 2"  ,     Bklassen);
        Elev ElevG = new Elev("Reza Rezvan 3"  ,     Cklassen);

        // H�r sparar vi ner skolan och l�ser in den

        try{
            skrivP�Fil(skola);
        } catch(IOException ex){

        } 

        try{
            l�sFr�nFil();
        } catch(IOException ex){

        }
    }

    public static void skrivP�Fil(Skola s) throws IOException {

        FileWriter fw = new FileWriter("utdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter fileOut = new PrintWriter(bw);

        // toFileString f�r att skriva den p� fil

        fileOut.println(s.toFileString());

        fileOut.close();
    }

    public static void l�sFr�nFil() throws IOException {
        FileReader fr = new FileReader("utdata.txt");
        BufferedReader fileIn = new BufferedReader(fr);

        String line = fileIn.readLine();
        while (line != null) {
            // Objekten skrivs ut

            Skola s = new Skola(line);
            System.out.println();
            line = fileIn.readLine();
            System.out.println(s);
        }

        fileIn.close();
    }
}
