public class Uppgift_Café{
    public static void main(String args[]) {
        int ålder = Kbd.readInt("\nHej och välkommen till café Reza!\nVi har just nu en kamapnj för ungdomar och pensionärer\nHur gammal är du?");
        
        if (ålder > 65 || (ålder >= 10 && ålder <= 18)){
            System.out.println("Du är precis gammal nog för våran rabatt!");
        }
        
        else{
            System.out.println("\nTyvärr är du inte gammal nog");
        }
           

    }
}
