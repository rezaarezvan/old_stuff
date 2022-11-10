package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;

package ObjektFält_Spara;


import java.io.*;
//import javax.swing.*;

public class Main //implements java.io.Serializable
{
    
    static Grupp[] grupp = new Grupp[20];

    public static void main(String[] args){
        
       hamtaAllt();
        
        boolean igen = true;
        while(igen){
            igen = meny();
        }
        sparaAllt();
    }
    
    static boolean meny(){
        boolean y = true;
         int val = Kbd.readInt("\n\n*****MENY*****\n\n1. skapa ny grupp och sätt betyg\n2.  visa alla grupper med betyg\n3.  avsluta\n\n");
        
        switch (val){
            case 1: int x = nasta(grupp);
                    grupp[x] = new Grupp();
                    grupp[x].betygsättning();break;
                    
            case 2: for(int i = 0 ; i < 20 ; i++){
                       if(grupp[i] != null)
                            grupp[i].visaBetyg();
                    }
                    break;
            case 3: y = false;
         }
         return y;
    }
    
    static int nasta(Grupp[] g){
        for(int i = 0 ; i < 20 ; i++){
             if(grupp[i] == null)
                return i;
       }
        return (-1);
    }
    
    
     static void sparaAllt(){
            try {
                 FileOutputStream fos=new FileOutputStream("grupp.dat");  
                 ObjectOutputStream oos=new ObjectOutputStream(fos);
                 oos.writeObject(grupp);
                 oos.close();
            } catch(Throwable t) {System.out.println("Fel vid sparande");}
        }
    
    static void hamtaAllt(){ 
            try {
                 FileInputStream fis=new FileInputStream("grupp.dat"); 
                 ObjectInputStream ois=new ObjectInputStream(fis);
                 grupp = (Grupp[]) ois.readObject();
                 ois.close();
            } catch(Throwable t) {System.out.println("Går ej att hämta info");}
        
     }
}
