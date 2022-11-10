public class Uppgifter_Switch{
    public static void main(String[] args) {
        int val = Kbd.readInt("\nKlicka 1 för att välja Cykel\nKlicka 2 för att välja Buss\nKlicka 3 för att välja tåg\nKlicka 4 för att välja bil");
        
        switch (val){
            case 1:
              System.out.println("\nDu har valt att cykla!");
              break;
              
            case 2:
              System.out.println("\nDu har valt att åka buss!");
              break;
            
            case 3:
              System.out.println("\nDu har valt att åka tåg!");
              break;
              
            case 4:
              System.out.println("\nDu har valt att åka bil!");
              break;  


        }
    }
}


        
    