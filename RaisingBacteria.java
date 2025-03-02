import java.util.Scanner;

public class RaisingBacteria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        int count = 0;

        for ( int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == '1') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}