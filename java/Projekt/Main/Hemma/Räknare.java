public class Räknare {
    public static void main(String[] args) {
        int fortsätt = 1;
        while(fortsätt == 1){
            int tal_1 = Kbd.readInt("Ange tal 1: ");
            int tal_2 = Kbd.readInt("Ange tal 2: ");

            int val = Kbd.readInt("Ange räknesätt\n1, +\n2. -\n3. *\n4. /");

            switch(val) {
                case 1: System.out.println(tal_1 + " + " + tal_2 + " = " + (tal_1+tal_2));
                break;

                case 2: System.out.println(tal_1 + " - " + tal_2 + " = " + (tal_1-tal_2));
                break;
                
                case 3: System.out.println(tal_1 + " * " + tal_2 + " = " + (tal_1*tal_2));
                break;
                
                case 4: System.out.println(tal_1 + " / " + tal_2 + " = " + (tal_1/(double)tal_2));
                break;
                
                default: System.out.println("Felaktig inmatning"); 
                         fortsätt = 1;
                break;
                
            }
            
            
            fortsätt = Kbd.readInt("Vill du fortsätta? (1. ja , 2. nej)");
            
        } 
       
    }
}