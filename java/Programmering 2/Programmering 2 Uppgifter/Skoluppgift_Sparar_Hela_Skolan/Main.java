import java.io.*;

public class Main{
    public static void main(String[] args) {

        Skola skola = new Skola("Hulebäck");

        Lärare LärareA = new Lärare("Lars Håkansson", skola);
        Lärare LärareB = new Lärare("Kalle Bengtsson", skola);
        Lärare LärareC = new Lärare("Erik Ek", skola);

        Klass Aklassen = new Klass("KlassID-20", LärareA, skola);
        Klass Bklassen = new Klass("KlassID-21", LärareB, skola);
        Klass Cklassen = new Klass("KlassID-22", LärareC, skola);

        Elev ElevA = new Elev("Erik Johannson" ,     Aklassen);
        Elev ElevB = new Elev("Johan Johannson",     Bklassen);
        Elev ElevC = new Elev("Jon Johannson"  ,     Cklassen);
        Elev ElevD = new Elev("Reza Rezvan"    ,     Aklassen);
        Elev ElevF = new Elev("Reza Rezvan 2"  ,     Bklassen);
        Elev ElevG = new Elev("Reza Rezvan 3"  ,     Cklassen);

        // Här sparar vi ner skolan och läser in den

        try{
            skrivPåFil(skola);
        } catch(IOException ex){

        } 

        try{
            läsFrånFil();
        } catch(IOException ex){

        }
    }

    public static void skrivPåFil(Skola s) throws IOException {

        FileWriter fw = new FileWriter("utdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter fileOut = new PrintWriter(bw);

        // toFileString för att skriva den på fil

        fileOut.println(s.toFileString());

        fileOut.close();
    }

    public static void läsFrånFil() throws IOException {
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
