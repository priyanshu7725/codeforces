import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for ( int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int count = 0;
            for ( int j = 0; j < 3; j++) {
                int b = sc.nextInt();

                if ( a < b) {
                    count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
