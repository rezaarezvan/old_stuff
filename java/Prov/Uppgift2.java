class Sortera{

    public static void main(final String[] args) {
        final int[] tal = new int[19];
        final int n = tal.length;

        System.out.println("Innan sortering:");

        for(int i = 0; i < n; i++) {
            tal[i] = (int) (Math.random() * 10) + 1; 
            System.out.print(tal[i] + " ");
        }
        System.out.println();
        medelvärde(tal);
        System.out.println();
        medianen(tal);
    }

    public static void medelvärde(final int[] tal) {
        double summa = 0;
        for(int i = 0; i < tal.length; i++){
            summa += tal[i];
        }
        final double medelvärde = (summa/(double)tal.length);
        System.out.printf("Medelväret är: " + "%.2f", medelvärde);
    }

    public static void medianen(final int[] tal) {
        sort(tal);
        
        final int medianen = tal[tal.length/2];
        System.out.println("Medianen är: " + medianen);
    }



    public static void sort(final int arr[]) 
    { 
        final int n = arr.length; 

        
        for (int i = 0; i < n; i++) 
        { 
            
            int min_index = i; 
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_index]) 
                    min_index = j; 
            }

        
            
            final int temp = arr[min_index]; 
            arr[min_index] = arr[i]; 
            arr[i] = temp; 
        
            System.out.print(arr[i]+ " "); 

        } 
    } 

 
} 
