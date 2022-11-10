
import java.util.*;
public class Stack_test{
    public static void main(String[] args){
        Stack<String> test = new Stack<>();
        System.out.println("PALINDROMTEST\n************\n");
        String ord = Kbd.readString("Skriv in ett ord: ");
        String omväntOrd ="";
        for(int i=0 ; i<ord.length() ; i++){
            test.push(ord.charAt(i)+"");
        }
        while(!test.isEmpty()){
            omväntOrd = omväntOrd + test.pop();
        }
        System.out.println(ord);
        System.out.println(omväntOrd);
        //if(ord.compareToIgnoreCase(omväntOrd)==0){
        if(ord.equals(omväntOrd)){
            System.out.println(ord + " är ett palindrom!");
        }else{
            System.out.println(ord + " är inget palindrom:(");
        }
    }    
}
