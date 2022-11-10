public class Sortering{
    public static void main(String[] args){
        int längd = Kbd.readInt("Ange längd på fältet : ");

        String[] ordFält = new String[längd];

        ordInMatning(ordFält);

        System.out.print("Osorterat fält: ");

        utSkrift(ordFält);

        simpleSort(ordFält);

        System.out.print("\nSorterat fält: ");

        utSkrift(ordFält);

    }

    public static void utSkrift(String[] ordFält){
        for(int i = 0; i < ordFält.length; i++){
            System.out.print(ordFält[i] + ",");
        }
    }

    public static void ordInMatning(String[] ordFält){
        for(int i = 0; i < ordFält.length; i++){
            String ord = Kbd.readString("Ange ord nummer " + (i+1));
            ordFält[i] = ord;
        }
    }

    public static void simpleSort(String[] ordFält){
        for(int i = 0; i < ordFält.length; i++){
            int min_ind = i;
            for(int j = i+1; j < ordFält.length; j++){
                if(ordFält[j].compareToIgnoreCase(ordFält[min_ind]) < 0) {
                    min_ind = j;
                }
            }
            String min = ordFält[i];
            ordFält[i] = ordFält[min_ind];
            ordFält[min_ind] = min;
        }
    }
}