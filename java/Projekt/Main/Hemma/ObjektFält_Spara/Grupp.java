package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

package ObjektF�lt_Spara;

import java.io.*;
public class Grupp implements Serializable
{
    Person[] person = new Person[3];
    String namn;
    //static int antalGrupper;
    
    public Grupp()
    {
        namn = Kbd.readString("\nAnge gruppens namn: ");
        for(int i = 0 ; i < 3 ; i++){
            String name = Kbd.readString("Ange namn f�r person " + (i+1) + ": ");
            person[i] = new Person(name);
        }
        //antalGrupper++;
    }

    void betygs�ttning(){
        System.out.println("\n");
        for(int i = 0 ; i < 3 ; i++){
            person[i].betyg = Kbd.readString("Betyg f�r " + person[i].namn + ": ");
        }
    }
    
    void visaBetyg(){
        System.out.println("\nBetyg f�r " + namn + "-gruppen\n");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(person[i].namn + " : " + person[i].betyg);
        }
    }
    
}
