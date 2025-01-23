import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;

            while ( n > 0) {
                int digit = n%10;
                sum += digit;
                n = n/10;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
