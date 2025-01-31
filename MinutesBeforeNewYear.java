import java.util.Scanner;

public class MinutesBeforeNewYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        while (n-- > 0) {
            int hr = sc.nextInt();
            int min = sc.nextInt();

            int timeLeft = (24*60 - ((hr*60)+min));

            System.out.println(timeLeft);
            
        }

        sc.close();
    }
}
