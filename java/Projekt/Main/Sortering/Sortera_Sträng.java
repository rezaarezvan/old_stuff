public class Sortera_Sträng{
    public static void main(String[] args){

        String sträng = Kbd.readString("Skriv en mening eller ett ord, så ska jag sortera det!");

        String sorterad_sträng;

        char[] chArr = sträng.toCharArray();

        char temp;

        for(int i = 0; i < chArr.length; i++){
            for(int j = i+1; j < chArr.length; j++){
                if(Character.toUpperCase(chArr[i]) > Character.toUpperCase(chArr[j])) {
                    temp=chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
            System.out.print(chArr[i]);
        }
    
    }
}