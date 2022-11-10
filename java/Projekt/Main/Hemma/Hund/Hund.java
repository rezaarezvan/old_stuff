
public class Hund
{
    //egenskaper
    private String ras, kön;
    private int ålder;
    
    //konstruerare
    public Hund(String r, String k, int å){
        ras = r;
        kön = k;
        ålder = å;
    }
    
    //metoder
    public void skrivUt(){
        System.out.println("\nRas: " + ras + "\nKön: " + kön + "\nÅlder: " + ålder);
    }
}
