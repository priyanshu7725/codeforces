import java.util.Scanner;

public class DislikeOfThrees {

    public static boolean isDisliked(int n) {
        return (n%3 == 0)||(n%10 == 3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int a = sc.nextInt();
            int count = 1;
            int term = 0;

            for ( int i = 1;; i++) {
                if ( !isDisliked(i)) {
                    if ( count == a) {
                        term = i;
                        break;
                    }
                    count++;
                }
            }

            System.out.println(term);
        }
        sc.close();
    }
}