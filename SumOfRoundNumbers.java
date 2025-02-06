import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            int parts[] = new int[5];
            int k = 0;
            int placeValue = 1;

            while ( num>0) {
                int digit = num%10;

                if ( digit != 0) {
                    parts[k++] = digit * placeValue;
                }
                num/= 10;
                placeValue *= 10;
            }

            System.out.println(k);

            for ( int i = 0; i < k; i++) {
                System.out.print(parts[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}