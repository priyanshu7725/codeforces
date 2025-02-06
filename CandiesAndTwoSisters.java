import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            if ( n>2) {
                if ( n%2 == 0) {
                    System.out.println((n/2)-1);
                }
                else {
                    System.out.println(n/2);
                }
                //System.out.println((n-1)/2);
            }
            else {
                System.out.println(0);
            }
            
        }
        sc.close();
    }
}