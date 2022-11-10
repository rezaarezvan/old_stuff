public class Uppgift1{
    public static void main(String[] args) {
        int tal = Kbd.readInt("Ange ett tal: ");
        
        if(tal < 25) {
            System.out.println("Talet är mindre än 25.");
        }
        else if(tal > 25) {
            System.out.println("Talet är större än 25.");
        }
        else {
            System.out.println("Talet är 25!");
        }
        
        System.out.println();
        
        for(int i = 92; i <= 98; i++) {
            System.out.print(i + " ");
        }
    }
}
