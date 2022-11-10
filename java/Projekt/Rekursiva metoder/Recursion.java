public class Recursion{
    public static void main(String[] args){
        System.out.println(doll(84));

    }

    public static int doll(int n){
        if(n >= 1000){
            return n-3;
        }
        else{
            return doll(doll(n+5));
        }
    }
}