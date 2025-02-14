import java.util.Scanner;

public class DieRoll {

    public static int commonFactor (int x, int y) {
        for ( int i = 2; i <= x; i++) {
            if ( x%i == 0 && y%i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        sc.close();

        int chances = 7-Math.max(Y,W);

        if ( chances == 6) {
            System.out.println("1/1");
        }
        else {
            int common = commonFactor(chances,6);
            int num = chances/common;
            int den = 6/common;

            System.out.println(num + "/" + den);
        }
        
    }
}