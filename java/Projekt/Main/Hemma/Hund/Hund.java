
public class Hund
{
    //egenskaper
    private String ras, k�n;
    private int �lder;
    
    //konstruerare
    public Hund(String r, String k, int �){
        ras = r;
        k�n = k;
        �lder = �;
    }
    
    //metoder
    public void skrivUt(){
        System.out.println("\nRas: " + ras + "\nK�n: " + k�n + "\n�lder: " + �lder);
    }
}
