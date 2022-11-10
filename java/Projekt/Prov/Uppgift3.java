public class Uppgift3{ 
    public static void main(String args[]) {

        int fortsätta = 1;
        while(fortsätta == 1) {

            int höjd = Kbd.readInt("Ange höjd");
            int bredd = Kbd.readInt("Ange bredd");
            print_rektangel(höjd, bredd);
            fortsätta = Kbd.readInt("Vill du fortsätta? (1: Ja , 2: Nej)");
            Kbd.clearScreen();
        }
        System.out.println("Hejdå!");
    } 

    public static void print_rektangel(int rad, int kolumn) 
    { 
        int i, j; 
        for (i = 1; i <= rad; i++) 
        { 
            for (j = 1; j <= kolumn; j++) 
            { 
                if (i == 1 || i == rad || j == 1 || j == kolumn)  
                            
                    System.out.print(" * ");             
                else
                    System.out.print("   ");             
            } 
            System.out.println(); 
        } 
    } 
} 