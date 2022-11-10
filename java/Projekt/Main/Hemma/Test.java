public class Test{
    public static void main(String[] args) {
        //Mata in talen
        double tal1 = Kbd.readDouble("Mata in första talet");
        double tal2 = Kbd.readDouble("Mata in andra talet");
        double prod = tal1*tal2;
        double sum  = tal1+tal2;
        
        System.out.println("RESULTAT\n============\nProdukten :" + tal1 + " * " + tal2 + " = " + prod + "\nSumman :" + tal1 + " + " + tal2+ " = " + sum);
    }
}
        
        
        
        
    