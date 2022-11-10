import java.util.*; 

public class Main{
    public static Spelare spelare = new Spelare();
    public static Dealer dealer = new Dealer();
    public static Deck deck = new Deck();
    public static int a = dealer.hand.size();

    public static void main(String[] args) {
        MainSlinga();
    }

    public static void Deala() {
        Card kortTillSpelare = deck.fåKort();
        spelare.hand.add(kortTillSpelare);
        deck.taBortKort();

        Card kortTillDealer = deck.fåKort();
        dealer.hand.add(kortTillDealer);
        deck.taBortKort();

        Card gömtKort = deck.fåKort();
        dealer.hand.add(gömtKort);
        deck.taBortKort();

        kortTillSpelare = deck.fåKort();
        spelare.hand.add(kortTillSpelare);
        deck.taBortKort();

    }

    public static void Hit() {
        Card kortTillSpelare = deck.fåKort();
        spelare.hand.add(kortTillSpelare);
        deck.taBortKort();

        // a++;

    }

    public static boolean Stay() {

        System.out.println("Du valde att stanna");
        System.out.println("Dealern har: " + dealer.hand);
        System.out.println("Dealerns värde: " + dealer.räknaSummaPåHand());

        boolean fortsätterSpelet = true;

        while(dealer.räknaSummaPåHand() <= 16){
            Card kortTillDealer = deck.fåKort();
            dealer.hand.add(kortTillDealer);
            deck.taBortKort();
            System.out.println("Dealern har: " + dealer.hand);
            System.out.println("Dealerns värde: " + dealer.räknaSummaPåHand());

        }

        if(dealer.räknaSummaPåHand() > 21){
            fortsätterSpelet = false;
            System.out.println("Dealern förlorade, du vann! :)");
        }
        else if(16 < dealer.räknaSummaPåHand() || dealer.räknaSummaPåHand() <= 21){
            if(KollarVemSomÄrNärmast()){
                fortsätterSpelet = false;
            }
        }

        a++;
        return fortsätterSpelet;
    }

    public static boolean KollarVemSomÄrNärmast(){
        int spelarensSumma = 21 - spelare.räknaSummaPåHand();
        int dealerensSumma = 21 - dealer.räknaSummaPåHand();
        boolean spelarenHarVunnit = false;
        if(spelarensSumma < dealerensSumma){
            spelarenHarVunnit = true;
            System.out.println("Du vann!!");
            return spelarenHarVunnit;
        }
        else if(spelarensSumma > dealerensSumma) {
            System.out.println("do forlora");
        }
        else if (spelarensSumma == dealerensSumma) {
            System.out.println("gg push");

        }

        return spelarenHarVunnit;
    }

    public static void Output() {
        System.out.println("Du har: " + spelare.hand);
        String dealernsOutput = "";
        for(int i = 0; i <= a; i++) {
            dealernsOutput += dealer.hand.get(i) + " ";
        }
        System.out.println("Dealern har: " + dealernsOutput);

    }

    public static String FrågaSpelaren() {
        String fortsätter;
        Scanner in = new Scanner(System.in);

        System.out.println("Spelarens värde: " + spelare.räknaSummaPåHand());
        System.out.println("Vill du hit eller stay");
        fortsätter = in.nextLine();

        return fortsätter;
    }

    public static boolean KollarVinstSpelare() {
        boolean fortsätterSpelet = true;
        String fortsätter = "";

        if(spelare.räknaSummaPåHand() == 21 && spelare.hand.size() == 2){
            fortsätterSpelet = false;
            fortsätter += "Du vann!";
            System.out.println(fortsätter);
        }
        else if (spelare.räknaSummaPåHand() > 21){
            fortsätterSpelet = false;
            fortsätter += "Du förlora";
            System.out.println(fortsätter);
        }
        return fortsätterSpelet;
    }

    public static void MainSlinga() {
        String fortsätter = "hit";
        deck.createDeck();
        Deala();
        if (!KollarVinstSpelare()){
            fortsätter = "";
        }

        while(fortsätter.equalsIgnoreCase("hit")) {
            Output();
            fortsätter = FrågaSpelaren();
            // Logik-gate
            if(fortsätter.equalsIgnoreCase("hit")){
                Hit();
            }
            else{
                if(!Stay()){
                    fortsätter = "";
                }   
            }

            if(!KollarVinstSpelare()){
                Output();
                fortsätter = "";
            }

        }
    }

}