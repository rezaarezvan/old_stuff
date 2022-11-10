public class Exempel_uppgift7{
    public static void main (String[] args){
        String svar = Kbd.readString("Vilket lag vann fotbolls-VM för damer år 2015");

        if (svar.equals("USA")){
            System.out.println("Rätt svar!");
        }

        else if (svar.equals("Usa")){
            System.out.println("Rätt svar!");
        }
        
        else if (svar.equals("usa")){
            System.out.println("Rätt svar!");
        }

        else {
            System.out.println("Fel svar!");
        }
    }
}