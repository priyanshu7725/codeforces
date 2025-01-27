import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for ( int i = 0; i < t; i++) {
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for ( int j = 0; j < 3; j++) {
                int a = sc.nextInt();   

                if (a > max) {
                    max2 = max;
                    max = a;
                } else if (a > max2 && a != max) {
                    max2 = a;
                }
            }

            System.out.println(max2);   
        }
        sc.close();
    }
}
