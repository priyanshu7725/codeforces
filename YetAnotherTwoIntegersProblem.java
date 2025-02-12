import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int steps = Math.abs(a-b);
            int count = 0;

            for ( int i = 10; i >= 1; i--) {
                count += steps/i;
                steps = steps%i;
                if ( steps == 0) {
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}