import java.util.Random;

public class Model{

    int[][] spelPlan;
    int[][] valdaDragPlan;
    int storlek;
    View observer;

    public Model (int wantedSize){      
        Random rand = new Random(); 
        storlek = wantedSize;
        this.spelPlan = new int[storlek][storlek];
        this.valdaDragPlan = new int[storlek][storlek];
        storlek = spelPlan.length;

        for(int row = 0; row < storlek; row++) {
            for(int col = 0; col < storlek; col++) {
                spelPlan[row][col] = rand.nextInt(89) + 10;

            }
        }

        // Konstruktor (till�tet att ignorera wantedSize och ta 5)/
        // Skapar hela spelplanen med storlek wantedSize * wantedSize)
        // Slumpar v�rden i varje ruta (10-99)

    }

    public int boardSize(){

        // Returnerar verklig storlek (= wantedSize i b�sta fall)
        return storlek;
    }

    public int getNumber(int row, int col){    
        int r = row - 1;
        int c = col - 1;

        // Returnerar det v�rde som finns i denna ruta
        return spelPlan[r][c];
    }

    public void choose(int row, int col){  
        int r = row - 1;
        int c = col - 1;
        valdaDragPlan[r][c] = spelPlan[r][c];
        observer.update();

        // Rutan med dessa koordinater v�ljs som drag
        // Till�tna v�rden �r 1.. boardSize(), sen n�r modellen �ndrats skall View informeras!
    }

    public int getSum(){    

        int summa = 0;

        for(int row = 0; row < storlek; row++) {
            for(int col = 0; col < storlek; col++) {
                summa += valdaDragPlan[row][col];

            }
        }
        // Returnerar true om rutan inte �r valbar
        return summa;
    }   

    public boolean isBlocked(int row, int col){
        int r = row - 1;
        int c = col - 1;

        for(int i = 0; i < storlek; i++) { 
            if(valdaDragPlan[r][i] != 0) {
                return true;
            }
        }

        for(int j = 0; j < storlek; j++) { 
            if(valdaDragPlan[j][c] != 0) {
                return true;
            }
        }

        return false;
        // Returnerar true om rutan inte �r valbar
    }

    public boolean isFree(int row, int col){    
        return !(this.isBlocked(row,col));
    }

    public boolean isChoosen(int row, int col){
        int r = row - 1;
        int c = col - 1;

        return(valdaDragPlan[r][c] != 0);
        // Returnerar true om rutan redan �r vald
    }   

    public void addObserver (View w) {
        this.observer = w;
        // Spara vyn, s� vi kan anropa dess update n�r det �r dags.   
    }
}