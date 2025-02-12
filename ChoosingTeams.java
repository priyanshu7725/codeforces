import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for ( int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if ( 5-a >= k) {
                count++;
            }
        }

        System.out.println(count/3);
        sc.close();
    }
}
