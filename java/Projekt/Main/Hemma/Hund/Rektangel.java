
public class Rektangel
{
    //egenskaper

    private int bredd, längd;

    //konstruerare
    public Rektangel(int l, int b){
        
          längd = l;
          bredd = b;
      
    }

    //metoder
    public void visaEgenskaper(){
        System.out.println("\nLängd: " + längd + " cm\nBredd: " + bredd + " cm");
    }

    public void visaArea(){
        System.out.println("\nArean = " + längd * bredd + " cm^2");
    }

    public void visaOmkrets(){
        System.out.println("\nOmkretsen = " + (2*längd + 2*bredd) + " cm");
    }

    public void rita(){
        for(int j = 0 ; j<= bredd ; j++){
            for(int i = 0 ; i<= längd ; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
