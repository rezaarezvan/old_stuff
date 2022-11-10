import java.io.*;

public class Main{
    public static void main(String[] args) {
        
        Skola skola = new Skola("Hulebäck");

        Lärare LärareA = new Lärare("Lars",  "Håkansson", skola);
        Lärare LärareB = new Lärare("Kalle", "Bengtsson", skola);
        Lärare LärareC = new Lärare("Erik",         "Ek", skola);

        Klass Aklassen = new Klass("KlassID-20", LärareA, skola);
        Klass Bklassen = new Klass("KlassID-21", LärareB, skola);
        Klass Cklassen = new Klass("KlassID-22", LärareC, skola);

        Elev ElevA = new Elev("Erik Johannson" , Aklassen);
        Elev ElevB = new Elev("Johan Johannson", Aklassen);
        Elev ElevC = new Elev("Jon Johannson",   Aklassen);
        
        // Här sparar vi ner A-klassen och läser in den
        try{
            write2File(Aklassen);
        } catch(Exception e){

        } 
        
        try{
            readFile();
        } catch(Exception e){

        }
        System.out.println(skola);
        
    }

    public static void write2File(Klass k) throws IOException {

        FileWriter fw = new FileWriter("utdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter fileOut = new PrintWriter(bw);

        // toFileString

        fileOut.println(k.toFileString());

        fileOut.close();
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("utdata.txt");
        BufferedReader fileIn = new BufferedReader(fr);

        String line = fileIn.readLine();
        while (line != null) {
            // Objekten skrivs ut

            Klass k = new Klass(line);
            System.out.println();
            line = fileIn.readLine();
            System.out.println(k);
        }
        
        fileIn.close();
    }
}
