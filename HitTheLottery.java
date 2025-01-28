import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int bills = 0;

        int[] notes = {100,20,10,5,1};

        
        for (int i = 0; i < notes.length; i++) {
            bills += amt / notes[i];
            amt = amt % notes[i];

            if ( amt == 0) {
                break;
            }
        }
        
        // bills += (int)(amt/100);
        // amt = amt % 100;

        // bills += (int)(amt/20);
        // amt = amt % 20;

        // bills += (int)(amt/10);
        // amt = amt % 10;

        // bills += (int)(amt/5);
        // amt = amt % 5;

        // bills += amt;

        System.out.println(bills);
        sc.close();
    }
}
