import java.util.Scanner;

public class SkibidiAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            String str = sc.next();
            int count = 0;
            
            for ( int i = 0; i < str.length()-1; i++) {
                if ( str.charAt(i) == str.charAt(i+1)) {
                    count = 1;
                    break;
                }
            }

            if ( count != 1) {
                count = str.length();
            }

            System.out.println(count);
        }
        sc.close();
        
    }
}
