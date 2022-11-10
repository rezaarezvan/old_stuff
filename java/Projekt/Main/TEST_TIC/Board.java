import java.util.ArrayList;
import java.util.List;
public class Board {
    public static final int NO_PLAYER = 0;
    public static final int PLAYER_X = 1;
    public static final int PLAYER_O = 2;
    private int[][] board = new int[3][3];
    public Point computerMove;

    public boolean isGameOver() {
        return hasPlayerWon(PLAYER_X) || hasPlayerWon(PLAYER_O) || getAvailableCells().isEmpty();
    }

    public boolean hasPlayerWon(int player) {
        if((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == player)
        ||
        (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == player)
        ) {
            return true;
        }

        for(int i = 0; i < 3; i++) {
            if((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == player)
            ||
            (board[0][i] == board[1][i] && board[0][i] == board[2][i] &&  board[0][i] == player) 
            ) {
                return true;
            }
        }

        return false;
    }

    public List<Point> getAvailableCells() {
        List<Point> availableCells = new ArrayList <>();

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == NO_PLAYER)
                    availableCells.add(new Point(i,j));
            }
        }

        return availableCells;
    } 

    public boolean placeAMove(Point point, int player) {
        if(board[point.x][point.y] != NO_PLAYER) {
            return false;
        }
       
        board[point.x][point.y] = player;
        return true;
    }

    public void displayBoard() {
        System.out.println();

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                String value = "[]";

                if(board[i][j] == PLAYER_X)
                    value = "X";
                else if(board[i][j] == PLAYER_O)
                    value = "O";

                System.out.print(value + " ");    
            }
            System.out.println();
        }
        System.out.println();
    }

    public int minimax(int depth, int turn) {
        if(hasPlayerWon(PLAYER_X)) {
            return 1;
        }
        if(hasPlayerWon(PLAYER_O)) {
            return -1;
        }

        List<Point> availableCells = getAvailableCells();

        if(availableCells.isEmpty())
            return 0;

        int min = Integer.MAX_VALUE;    
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < availableCells.size(); i++) {
            Point point = availableCells.get(i);

            if (turn == PLAYER_X) {
                placeAMove(point, PLAYER_X);
                int currentScore = minimax(depth + 1, PLAYER_O);
                max = Math.max(currentScore, max);

                if (depth == 0) {
                    System.out.println("Computer score for position " + point + " = " + currentScore);
                }

                if (currentScore >= 0) {
                    if (depth == 0) {
                        computerMove = point;
                    }
                }

                if( currentScore == 1) {
                    board[point.x][point.y] = NO_PLAYER;
                    break;
                }

                if( i == availableCells.size() - 1 && max < 0)
                    if(depth == 0)
                        computerMove = point;

            } else if (turn == PLAYER_O) {
                placeAMove(point, PLAYER_O);
                int currentScore = minimax(depth +1, PLAYER_X);
                min = Math.min(currentScore, min);

                if ( min == -1) {
                    board[point.x][point.y] = NO_PLAYER;
                    break;    
                }

            }
            board[point.x][point.y] = NO_PLAYER;
        }
        
        return turn == PLAYER_X ? max : min;
    }
}