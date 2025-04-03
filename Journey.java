import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, a, b, c;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            int days = 0;
            int total = a + b + c;

            if ( n%total == 0) {
                days = 3*(n/total);
            }
            else {
                int rem = n%total;
                if (rem <= a) {
                    days = 1 + 3*(n/total);
                } else if (rem <= a + b) {
                    days = 2 + 3*(n/total);
                } else {
                    days = 3 + 3*(n/total);
                }
            }

            System.out.println(days);
        }
        sc.close();
    }
}