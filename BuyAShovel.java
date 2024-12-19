import java.util.Scanner;

public class BuyAShovel {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int shovel = 1;
        while(true){
            if ( (k*shovel)%10 == r || (k*shovel)%10 == 0) {
                System.out.println(shovel);
                break;
            }
            shovel++;
        }
        sc.close();
    }
}
