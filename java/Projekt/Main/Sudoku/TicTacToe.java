public class TicTacToe {
    public static void main(String[] args) {

        char[][] spelRuta = {

                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},

            };

        ritaSpelRuta(spelRuta);

        int pos = Kbd.readInt("Välj en ruta (1-9): ");

        System.out.println(pos);
        
        läggSymbol(spelRuta, pos, "spelare");
        
        läggSymbol(spelRuta, pos, "cpu");

        ritaSpelRuta(spelRuta);
    }

    public static void ritaSpelRuta(char[][] spelRuta) {
        for(char[] rad : spelRuta) {
            for(char c: rad) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void läggSymbol(char[][] spelRuta, int pos, String användare) {

        char symbol = 'X';

        if(användare.equals("spelare")) {
            symbol = 'X';
        } else if(användare.equals("cpu")) {
            symbol = 'O';
        }

        switch(pos) {
            case 1:
            spelRuta[0][0] = symbol;
            break;
            
            case 2:
            spelRuta[0][2] = symbol;
            break;
            
            case 3:
            spelRuta[0][4] = symbol;
            break;
            
            case 4:
            spelRuta[2][0] = symbol;
            break;
            
            case 5:
            spelRuta[2][2] = symbol;
            break;
            
            case 6:
            spelRuta[2][4] = symbol;
            break;

            case 7:
            spelRuta[4][0] = symbol;
            break;
            
            case 8:
            spelRuta[4][2] = symbol;
            break;
            
            case 9:
            spelRuta[4][4] = symbol;
            break;   
        }
    }
}