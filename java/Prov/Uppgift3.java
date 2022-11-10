public class Uppgift3{ 
    public static void main(String args[]) {

        int fortsatta = 1;
        while(fortsatta == 1) {

            int hojd = Kbd.readInt("Ange hojd");
            int bredd = Kbd.readInt("Ange bredd");
            print_rektangel(hojd, bredd);
            fortsatta = Kbd.readInt("Vill du fortsatta? (1: Ja , 2: Nej)");
            Kbd.clearScreen();
        }
        System.out.println("Hejda!");
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