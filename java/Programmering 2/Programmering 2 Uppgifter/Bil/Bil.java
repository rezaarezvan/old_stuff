package Bil;

public class Bil {

    String regNummer; 
    String fabrikat;
    int arsModell;
    int tjansteVikt;
    int motorEffekt;

    public Bil(){

        regNummer = Kbd.readString("Vad för regskyllt har du?");
        fabrikat = Kbd.readString("Vilken modell?");
        arsModell = Kbd.readInt("Vilken årsmodell?");
        tjansteVikt = Kbd.readInt("Vad är tjänstevikten?");
        motorEffekt = Kbd.readInt("hur menga hester????");

    }
    
}