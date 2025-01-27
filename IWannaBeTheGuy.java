import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int t_levels = sc.nextInt();
            boolean[] completed = new boolean[t_levels + 1];

            int lilX = sc.nextInt();
            
            for( int i = 0; i < lilX; i++) {
                int x = sc.nextInt();
                completed[x] = true;
            }

            int lilY = sc.nextInt();

            for ( int i = 0; i < lilY; i++) {
                int y = sc.nextInt();
                completed[y] = true;
            }

            for ( int i = 1; i <= t_levels; i++) {
                if (!completed[i]) {
                    System.out.println("Oh, my keyboard!");
                    return;
                }
            }

            System.out.println("I become the guy.");
        } 
        finally {
            sc.close();
        }
    }
}
