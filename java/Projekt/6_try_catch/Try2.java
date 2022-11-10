public class Try2
{
    public static void main(String args[]) {
        for(int i = 10 ; i>0 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Throwable t){}
        }
        System.out.println("BOOOM!!");
    }
    
}
