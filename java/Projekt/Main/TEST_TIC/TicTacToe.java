
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Board b = new Board();
        Scanner scanner = new Scanner(System.in);
        b.displayBoard();
        System.out.println("Select turn:\n1. Computer (x) / 2, User (O) : ");

        int choice = scanner.nextInt();

        if(choice == Board.PLAYER_X) {
            Point p = new Point(RANDOM.nextInt(3), RANDOM.nextInt(3));
            b.placeAMove(p, Board.PLAYER_X);
            b.displayBoard();
        }

        while(!b.isGameOver()) {
            boolean moveOk = true;

            do {
                if(!moveOk) {
                    System.out.println("Cell already filled !");
                }
                
                System.out.println("Your move : ");
                Point userMove = new Point(scanner.nextInt(), scanner.nextInt());
                moveOk = b.placeAMove(userMove, Board.PLAYER_O);
               

            }while(!moveOk);
            
            b.displayBoard();
            
            if(b.isGameOver()) {
                break;
            }
            
            b.minimax(0, Board.PLAYER_X);
            System.out.println("Computer choose posoition : " + b.computerMove);
            
            b.placeAMove(b.computerMove, Board.PLAYER_X);
            b.displayBoard();
            
        }
        
        if(b.hasPlayerWon(Board.PLAYER_X))
            System.out.println("You lost !");
        else if(b.hasPlayerWon(Board.PLAYER_O))
            System.out.println("You win !");
        else
            System.out.println("Tie !");
    }

}