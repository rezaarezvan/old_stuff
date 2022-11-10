public class Test_Prov{
    public static void main(String[] args) {
        int fält[] = new int[10];
        int n = fält.length;
        
        for(int i = 0; i < n; i++) {
            fält[i] = (int) (Math.random()* 100) + 1;
            System.out.print(fält[i] + " ");
        }
            int största = fält[0];
            int minsta = fält[0];
            for(int i = 1; i < n; i++) {
                if(fält[i] > största) {
                    största = fält[i];
                }
                else if(fält[i] < minsta) {
                    minsta = fält[i];
                }
    
            }
        System.out.println();
        System.out.println("Minsta talet i fältet är: " + minsta);
        System.out.println("Största talet i fältet är: " + största);
    }
}