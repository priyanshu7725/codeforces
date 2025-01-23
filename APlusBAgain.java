import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            // while ( n > 0) {
            //     int digit = n%10;
            //     sum += digit;
            //     n = n/10;
            // }
            int sum = n/10 + n%10;
            // can write this also instead of above while loop
            // since 'n' is always a two digit number

            System.out.println(sum);
        }
        sc.close();
    }
}
