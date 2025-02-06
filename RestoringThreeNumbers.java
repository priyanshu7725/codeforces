import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[4];
        int sumAllidx = 0;
        int max = 0;

        for ( int i = 0; i < 4; i++) {
            sum[i] = sc.nextInt();

            if ( sum[i] > max) {
                max = sum[i];
                sumAllidx = i;
            }
        }

        for ( int i = 0; i < 4; i++) {
            if ( i != sumAllidx) {
                System.out.print(max - sum[i] + " ");
            }
        }
        sc.close();
    }
}
