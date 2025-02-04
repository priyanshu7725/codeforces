import java.util.Scanner;

public class SpellCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        

        while ( t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            String[] nameChars = {"T","i","m","u","r"};
            boolean spelling = true;

            if ( n != 5) {
                spelling = false;
            }
            else {
                for ( int i = 0; i < 5; i++) {
                    if (! str.contains(nameChars[i])) {
                        spelling = false;
                        break;
                    }
                }
            }

            if ( spelling) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
