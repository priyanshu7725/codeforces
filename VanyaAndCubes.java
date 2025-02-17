import java.util.Scanner;

public class VanyaAndCubes {
   public static int level(int a) {
        int sum = 0;

        for ( int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int sum = 0;
        int endBl = 1;
        int count = 0;
        while ( x > sum) {
            

            sum += level(endBl);

            if ( sum > x) {
                break;
            }
            else if ( sum == x ) {
                count++;
                break;
            }
            else {
                count++;
                endBl++;
            }
        }

        System.out.println(count);
        sc.close();
    } 
}
