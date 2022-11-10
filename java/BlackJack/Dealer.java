import java.util.ArrayList;

public class Dealer{   
    ArrayList<Card> hand;

    public Dealer(){
        hand = new ArrayList<Card>();
    }

    public String toString() {
        String output = "";
        int i = 1;
        for(Card kort : hand) {
            output += "\n" + i + "-" + kort.toString();
            i++;
        }
        return output;
    }

    public int räknaSummaPåHand() {
        int summa = 0;
        int ess = 0;
      
        for(Card aCard : hand){
            
            switch(aCard.getNummer()){
                case TVÅ: summa += 2; break;
                case TRE: summa += 3; break;
                case FYRA: summa += 4; break;
                case FEM: summa += 5; break;
                case SEX: summa += 6; break;
                case SJU: summa += 7; break;
                case ÅTTA: summa += 8; break;
                case NIO: summa += 9; break;
                case TIO: summa += 10; break;
                case KNEKT: summa += 10; break;
                case DAM: summa += 10; break;
                case KUNG: summa += 10; break;
                case ESS: ess += 1; break;
            }			
        }

       
        for(int i = 0; i < ess; i++){
            
            if (summa > 10){
                summa += 1;
            }
            else{
                summa += 11;
            }
        }

     
        return summa;

    }

}
