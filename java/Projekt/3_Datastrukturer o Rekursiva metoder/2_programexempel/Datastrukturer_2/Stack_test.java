
import java.util.*;
public class Stack_test{
    public static void main(String[] args){
        Stack<String> test = new Stack<>();
        System.out.println("PALINDROMTEST\n************\n");
        String ord = Kbd.readString("Skriv in ett ord: ");
        String omv�ntOrd ="";
        for(int i=0 ; i<ord.length() ; i++){
            test.push(ord.charAt(i)+"");
        }
        while(!test.isEmpty()){
            omv�ntOrd = omv�ntOrd + test.pop();
        }
        System.out.println(ord);
        System.out.println(omv�ntOrd);
        //if(ord.compareToIgnoreCase(omv�ntOrd)==0){
        if(ord.equals(omv�ntOrd)){
            System.out.println(ord + " �r ett palindrom!");
        }else{
            System.out.println(ord + " �r inget palindrom:(");
        }
    }    
}
