public class Uppgifter_72{
    public static void main(String[] args) {
        int val = Kbd.readInt("\nKlicka 1: för ensamboende\nKlicka 2: för sammanboende");
        int km = Kbd.readInt("\nHur långt är det till jobbet?");
        int år = Kbd.readInt("\nHur länge är du anställd? (I år)");

        if (val == 1 && km>=50 && år<=1){
            System.out.print("\nDu har rätt till skatteavdrag!\nKontakta Skatteverket för mer information!");
        }

        else if (val == 2 && km>=50 && år<=3){
            System.out.print("\nDu har rätt till skatteavdrag!\nKontakta Skatteverket för mer information!");
        }

        else{
            System.out.print("\nDu har inte rätt skatteavdrag!\nKontakta Skatteverket för mer information!");

        }
    }
}

        
    