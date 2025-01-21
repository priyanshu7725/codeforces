import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String validChar = "codeforces";

        for ( int i = 0; i < t; i++){
            String a = sc.next();
            

            if ( validChar.contains(a)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
