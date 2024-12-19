import java.util.Scanner;

public class BuyAShovel {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        // minimum 1 shovel is to be bought
        int shovel = 1;
        while(true){

            // if after using 10 burle coins, the r coin needs be used
            // or if shovel can be bought directly using 10 burle coins
            if ( (k*shovel)%10 == r || (k*shovel)%10 == 0) {
                System.out.println(shovel);
                break;
            }
            shovel++;
        }
        sc.close();
    }
}
