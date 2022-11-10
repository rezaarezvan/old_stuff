public class HiLo{
    public static void main (String[] args){
        //Start och totalvariabler

        int omgångar = 0;
        
        String fortsätta = "ja";
        int totalaGissningar = 0;
        while (fortsätta.equalsIgnoreCase("ja")){
            omgångar++;
            int max = 0;
            //Hälsning
            if (omgångar == 1){
                System.out.println("\nVälkommen till HiLo!\nSkriv in en svårighetsgrad!\n");
                System.out.println("Level 1: Enkel [1-10]");
                System.out.println("Level 2: Medium [1-100]");
                System.out.println("Level 3: Svår [1-1000]");
                System.out.print("\nSlå in svårighetsgrad: ");
            }

            else if (omgångar > 1){
                System.out.print("\nSlå in svårighetsgrad: ");
                System.out.println("\nLevel 1: Enkel [1-10]");
                System.out.println("Level 2: Medium [1-100]");
                System.out.println("Level 3: Svår [1-1000]");               
            }

            spel(max,totalaGissningar,omgångar,fortsätta);
            
        }
    }

    public static int while_slinga (int max){
        int antalGissningar = 1;
        int tal = (int)(Math.random() * max) + 1;
        int Gissning = Kbd.readInt("\nGissa talet mellan 1-" + max + "\n");
        while (Gissning != tal){
            antalGissningar++;
            if (tal < Gissning){
                Gissning = Kbd.readInt("\nLägre\n");
            }
            else if (tal > Gissning){
                Gissning = Kbd.readInt("\nHögre\n");
            }
        }
        if (tal == Gissning){
            System.out.println("\nRätt svar!\n\n Försök:    " + antalGissningar + " gånger");
        }
        return antalGissningar;
    }

    public static void avsluta_metod(String fortsätta, int omgångar,long medelTid,int medelGissning){
        fortsätta = Kbd.readString("\nSkriv Ja för att fortsätta spela\nSkriv Nej för att avsluta.");
        while(!fortsätta.equalsIgnoreCase("ja") && !fortsätta.equalsIgnoreCase("nej")){
            Kbd.clearScreen();
            System.out.println("\nFelinmatning\nFörsök igen");
            fortsätta = Kbd.readString("\nSkriv Ja för att fortsätta spela\nSkriv Nej för att avsluta.");
        }
        if (fortsätta.equalsIgnoreCase("ja")){
            Kbd.clearScreen();
            System.out.println("\nVälkommen till runda " + (omgångar+1));
        }
        else if (fortsätta.equalsIgnoreCase("nej")){
            Kbd.clearScreen();
            System.out.println("Medelvärdet på dina gissningar är " + (double)medelGissning);
            System.out.println("Det tog dig i snitt "+ (double)medelTid + "s");
            System.out.println("Hejdå!");
            System.exit(0);
        }
    }

    public static int val_meny(int val,int max){
        while (!(val>0&&val<=3)){
            System.out.println("\nSlå in rätt svårighetsgrad!");
            val = Kbd.readInt("\nTryck 1: [1-10]\nTryck 2: [1-100]\nTryck 3: [1-1000]\n");
        }
        if (val == 1){
            max = 10;
        }

        else if (val == 2){
            max = 100;
        }

        else if (val == 3){
            max = 1000;
        }
        return max;
    }

    public static void spel(int max,int totalaGissningar,int omgångar,String fortsätta) {
        long totalTid= 0;
        // Val menyn
        int val = Kbd.readInt();

        max = val_meny(val, max);

        // Tid och gissningar
        // startTid
        long startTid = System.currentTimeMillis();

        // Gissnings slinga och totalagissningar
        totalaGissningar += while_slinga(max);

        // stopTid
        long stoppTid = System.currentTimeMillis();

        long tid = (stoppTid - startTid);

        totalTid += (tid/1000);

        long medelTid = totalTid/omgångar;
        int medelGissning = totalaGissningar/omgångar;

        System.out.println(" Tid:       " + (tid/1000) + " sekunder");
        // avsluta
        avsluta_metod(fortsätta, omgångar, totalTid, totalaGissningar);   
    }
}