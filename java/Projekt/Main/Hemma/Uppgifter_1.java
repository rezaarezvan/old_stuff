public class Uppgifter_1{
    public static void main(String[] args) {
            int val = Kbd.readInt("\nKlicka 1 för att svänga höger\nKlicka 2 för att forsätta rakt fram");
            
            if (val == 1){
                System.out.println("Du har valt att svänga höger!\n5km kvar");
            }
            
            if (val == 2){
                System.out.println("Du har valt att forsätta!\n10km kvar");
            }

    }
}
        
        
        
        
    