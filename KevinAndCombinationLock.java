import java.util.Scanner;

public class KevinAndCombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            if ( n != 33) {
                for ( int i = 0; i < sb.length()-1;i++) {
                    if ( sb.charAt(i) == '3' && sb.charAt(i+1) == '3') {
                        sb.delete(i,i+2);
                    }
                }
            }
            
            if ( sb.length() <= 0) {
                System.out.println("Yes");
            }
            else {
                int m = Integer.parseInt(sb.toString());

                if ( m % 33 == 0) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            
        }
        sc.close();
    }
}
