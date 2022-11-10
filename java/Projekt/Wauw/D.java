public class D{
    public static void main(String[] args){
        int[] lst = {2,3,5,7,11};
        
        int total = 0;
        for (int i = 0; i < lst.length; i++) {
            total  = total + 3 * lst[i];
        }
        
        System.out.println(total);
    }
}