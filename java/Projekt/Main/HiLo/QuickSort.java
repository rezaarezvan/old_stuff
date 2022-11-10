import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int x = Kbd.readInt("Välj längd av arrayen");
        int[] tal = new int[x];

        for(int i=0 ; i < tal.length ; i++){
            tal[i] = (int)(Math.random()*100)+1;
        }

        System.out.println(Arrays.toString(tal));

        int low = 0;
        int high = tal.length - 1;

        quickSort(tal, low, high);

        System.out.println(Arrays.toString(tal));

    }
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}