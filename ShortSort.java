import java.util.Scanner;

public class ShortSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String str = sc.next();

            if (str.equals("abc") || str.equals("bac") || str.equals("cba") || str.equals("acb")) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
