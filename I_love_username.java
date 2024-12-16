import java.util.Scanner;

public class I_love_username {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        // one input is taken outside since first contest cannot be amazing
        // as we dont have data on max and min
        int a = sc.nextInt();

        // after first contest, it becomes max and min for us 
        int min = a;
        int max = a;
        int amazing = 0;
        for ( int i = 1; i < t; i++) {
            a = sc.nextInt();

            if ( a > max) {
                max = a;
                amazing++;  
            }
            else if ( a < min) {
                min = a;
                amazing++;
            }
        }
        System.out.println(amazing);
        sc.close();
    }
}
