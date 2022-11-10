import java.util.concurrent.TimeUnit ;

public class Sudoku {
    private int[][] grid;
    private static final int EMPTY = 0;
    private static final int SIZE = 9;

    public Sudoku(int[][] grid) {
        this.grid = new int[SIZE][SIZE];

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                this.grid[i][j] = grid[i][j];

            }
        }

    }

    private boolean isInRow(int rad, int nummer) {
        for(int i = 0; i < SIZE; i++) {
            if(grid[rad][i] == nummer) {
                return true;
            }
        }
        return false;        
    }

    private boolean ärICol(int col, int nummer) {
        for(int i = 0; i < SIZE; i++) {
            if(grid[i][col] == nummer) {
                return true;
            }
        }

        return false;        
    }

    private boolean ärILåda(int rad, int col, int nummer) {
        int r = rad - (rad % 3);
        int c = col - (col % 3);

        for(int i = r; i < (r + 3); i++) {
            for(int j = c; j < (c + 3); j++) {
                if(grid[i][j] == nummer) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean ärOk(int rad, int col, int nummer) {
        return !isInRow(rad, nummer) && !ärICol(col, nummer) && !ärILåda(rad, col, nummer);
    }

    public boolean BT() {
        for(int rad = 0; rad < SIZE; rad++) {
            for(int col = 0; col < SIZE; col++) { 
                if(grid[rad][col] == EMPTY) {

                    for(int nummer = 1; nummer <= SIZE; nummer++) {
                        if(ärOk(rad, col, nummer)) {

                            grid[rad][col] = nummer;

                            if(BT()) {
                                return true;

                            } 
                            else {
                                grid[rad][col] = EMPTY;
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    public void visa() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println();
        }
    }

}


