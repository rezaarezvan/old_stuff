public class Card{
    Färg färg;
    Nummer nummer;
    
    public Card(Färg f, Nummer n) {
        färg = f;
        nummer = n;
    }
    
    public String toString() {
        return this.färg.toString() + "-" + this.nummer.toString();
    }
    
    public Färg getFärg() {
        return färg;
    }
    
    public Nummer getNummer() {
        return nummer;
    }
}