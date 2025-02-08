import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();
        sc.close();

        int drink_toasts = k*l/(nl);
        int lime = c*d;
        int salt = p/np;

        int total_toasts = Math.min(drink_toasts,Math.min(lime,salt))/n;
        System.out.println(total_toasts);
    }
}