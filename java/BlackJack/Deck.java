import java.util.ArrayList;
import java.util.*;

public class Deck{
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public void createDeck() {
        for(Färg kortFärg : Färg.values()) {
            for(Nummer kortNummer : Nummer.values()) {
                this.cards.add(new Card(kortFärg, kortNummer));
            }   
        }

        randomise();
    }

    public void randomise() {
        Collections.shuffle(cards);
    }

    public void taBortKort() {
        cards.remove(0);
    }

    public Card fåKort() {

        return cards.get(0);

    }

    public String toString() {
        String output = "";
        int i = 1;
        for(Card kort : this.cards) {
            output += "\n" + i + "-" + kort.toString();
            i++;
        }
        return output;
    }
}