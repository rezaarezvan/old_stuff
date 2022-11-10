public class Sortering{
    public static void main(String[] args){
        int l�ngd = Kbd.readInt("Ange l�ngd p� f�ltet : ");

        String[] ordF�lt = new String[l�ngd];

        ordInMatning(ordF�lt);

        System.out.print("Osorterat f�lt: ");

        utSkrift(ordF�lt);

        simpleSort(ordF�lt);

        System.out.print("\nSorterat f�lt: ");

        utSkrift(ordF�lt);

    }

    public static void utSkrift(String[] ordF�lt){
        for(int i = 0; i < ordF�lt.length; i++){
            System.out.print(ordF�lt[i] + ",");
        }
    }

    public static void ordInMatning(String[] ordF�lt){
        for(int i = 0; i < ordF�lt.length; i++){
            String ord = Kbd.readString("Ange ord nummer " + (i+1));
            ordF�lt[i] = ord;
        }
    }

    public static void simpleSort(String[] ordF�lt){
        for(int i = 0; i < ordF�lt.length; i++){
            int min_ind = i;
            for(int j = i+1; j < ordF�lt.length; j++){
                if(ordF�lt[j].compareToIgnoreCase(ordF�lt[min_ind]) < 0) {
                    min_ind = j;
                }
            }
            String min = ordF�lt[i];
            ordF�lt[i] = ordF�lt[min_ind];
            ordF�lt[min_ind] = min;
        }
    }
}