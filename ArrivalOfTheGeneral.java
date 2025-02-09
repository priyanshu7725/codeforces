import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max_index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[max_index]) {
                max_index = i;
            }
        }

        int min_index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[min_index]) {
                min_index = i;
            }
        }

        // Calculate swaps needed
        int swaps = max_index + (n - 1 - min_index);

        // If tallest is ahead of shortest, reduce one swap
        if (max_index > min_index) {
            swaps--;
        }

        System.out.println(swaps);

        sc.close();
    }
}
