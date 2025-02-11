import java.util.Scanner;
import java.util.Arrays;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] coins = new int[t];
        int total = 0;
        int mine = 0;
        int count = 0;
        
        for (int i = 0; i < t; i++) {
            coins[i] = sc.nextInt();
            total+=coins[i];
        }
        Arrays.sort(coins);

        for ( int i = t-1; i >= 0; i--) {
            mine += coins[i];
            count++;
            if ( mine > total/2) {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}