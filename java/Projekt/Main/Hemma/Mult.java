public class Mult{
    public static void main(String[] args) {
        int val = Kbd.readInt("Ange ett nummer (1-10)");
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(val + " * " + i + " = " +(val*i));
        }
    }
}