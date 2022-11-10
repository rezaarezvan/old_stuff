public class  Bubble_sort{
    public static void main(String[] args){

        int längd = Kbd.readInt("Ange längd för fältet");

        int[] tal = new int[längd];

        for(int i = 0; i < tal.length; i++){
            tal[i] = (int)(Math.random()*100)+1;
            System.out.print(tal[i] + " ");
            if((i+1) % 10 == 0){
                System.out.println(" ");
            }
        } 
        System.out.println("\nEfter sortering");

        bubbleSort(tal);

        int n = tal.length; 
        for (int i=0; i<n; i++) 
            System.out.print(tal[i] + " "); 
        //System.out.println(); 

    }

    static void bubbleSort(int[] tal){  

        for (int i = 0; i < tal.length; i++){ 
            for (int j = 0; j < (tal.length-i-1) ; j++){ 
                if (tal[j] > tal[j+1]){ 
                    int temp = tal[j]; 
                    tal[j] = tal[j+1]; 
                    tal[j+1] = temp; 
                } 
            }

        }
    }
}
