import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int welfare = 0;
        
        int n = sc.nextInt();
        int cit[] = new int[n];
        int max = 0;
            

        for ( int j = 0; j < n; j++) {
            cit[j] = sc.nextInt();

            if ( cit[j] > max) {
                max = cit[j];
            }
        }

        for ( int j = 0; j < n; j++) {
            welfare += max - cit[j];
        }
            
        System.out.println(welfare);
        sc.close();
    }
}
