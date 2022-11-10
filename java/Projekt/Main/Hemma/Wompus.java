import java.util.Arrays;

public class Wompus {

    public static void main(String[] args){

        char[][] grotta =  {  {'S','X','X','X','X','X','X','X'},
                {'X','O','O','O','O','O','O','X'},
                {'X','O','O','H','G','M','H','X'},
                {'X','O','O','O','O','O','O','X'},
                {'X','X','X','X','X','X','X','X'} };
                
           char startPostion = grotta[1][1];    
                
           int val = Kbd.readInt("1N 2S 3V 4Ö");
           
           
           if(val == 1){
               char postion = grotta[0][1];
            }
            if(val == 2){
               char postion = grotta[2][1];
            }
            if(val == 3){
               char postion = grotta[1][0];
            }
            if(val == 4){
               char postion = grotta[0][2];
            }
           
           
                
        String txt = "";
        for(int i = 0; i < 5 ; i++) {
            for(int j = 0; j < 8; j++) {
                txt += grotta[i][j];
            }
            txt = txt+ "\n";
        }
        System.out.print(txt);
        System.out.println(grotta[0][0]);
    }
}
