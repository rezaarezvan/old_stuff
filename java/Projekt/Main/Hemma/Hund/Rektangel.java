
public class Rektangel
{
    //egenskaper

    private int bredd, l�ngd;

    //konstruerare
    public Rektangel(int l, int b){
        
          l�ngd = l;
          bredd = b;
      
    }

    //metoder
    public void visaEgenskaper(){
        System.out.println("\nL�ngd: " + l�ngd + " cm\nBredd: " + bredd + " cm");
    }

    public void visaArea(){
        System.out.println("\nArean = " + l�ngd * bredd + " cm^2");
    }

    public void visaOmkrets(){
        System.out.println("\nOmkretsen = " + (2*l�ngd + 2*bredd) + " cm");
    }

    public void rita(){
        for(int j = 0 ; j<= bredd ; j++){
            for(int i = 0 ; i<= l�ngd ; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
