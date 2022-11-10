public class WhileWhile{
    public static void main(String[] args){
        int i = 1;

        while(i != 2){
            int j = 1;
            i = Kbd.readInt("1 eller 2 YTTRE");
            while(j != 2){
                j = Kbd.readInt("1 eller 2 INRE");
            }

        }
    }
}