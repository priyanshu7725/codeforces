import java.util.Scanner;

public class Lucky {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for ( int i = 0; i < t; i++){
            String num = sc.next();
            int sum_f = 0;
            int sum_l = 0;

            for ( int j = 0; j < 3; j++){
                sum_f += Integer.parseInt(num.substring(j,j+1));
            }

            for ( int j = 3; j < 6; j++){
                sum_l += Integer.parseInt(num.substring(j,j+1));
            }
            
            if ( sum_f == sum_l){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}