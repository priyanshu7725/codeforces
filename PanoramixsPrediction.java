import java.util.Scanner;

public class PanoramixsPrediction {

    public static boolean prime(int num) {
        
        if ( num ==1) {
            return false;
        }
        if (num == 2){
            return true;
        }
        for( int i = 2; i <= num/2; i++) {
            if ( num%i == 0) {
                return false;
            }
        }
    
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nextPrime = n+1;

        while(!prime(nextPrime)) {
            nextPrime++;
        }

        if(nextPrime == m) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
