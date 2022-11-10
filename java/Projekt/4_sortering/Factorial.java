public class Factorial {

    public int factorial(int n) {
        int svar = 1;
        if(n>12) {
            throw new IllegalArgumentException("Useless fuffery!");
        }
        if(n>1){
            svar = n * factorial(n-1);
        }
        return svar;
    }
}