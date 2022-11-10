public class Rektangel_Test{ 
      
    
    public static void print_rektangel(int n, int m) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
       
    } 
       
    
    public static void main(String args[]) 
    { 
        int höjd = Kbd.readInt("Ange höjd");
        int bredd = Kbd.readInt("Ange bredd");
        print_rektangel(höjd, bredd); 
    } 
} 