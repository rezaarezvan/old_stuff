import java.util.Scanner;
public class Test {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange fältets längd");
        int längd = scanner.nextInt();
        int[] tal = new int[längd];

        for(int i = 0; i < tal.length; i++){
            tal[i] = (int)(Math.random()*100)+1;
            System.out.print(tal[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println(" ");
            }

        }

        for (int i = 0; i < tal.length; i++) {
            int min = tal[i];
            int minInd = i;
            for (int j = i+1; j < tal.length; j++) {
                if (tal[j] < min) {
                    min = tal[j];
                    minInd = j;
                }
            }
            // swapping
            int temp = tal[i];
            tal[i] = min;
            tal[minInd] = temp;
        }

        System.out.println("Efter sortering...");

        for(int i = 0; i < tal.length; i++){
            System.out.print(tal[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println(" ");
            }

        }
    }
}

