import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int availablePolice = 0;
        int untreatedCrime = 0;
        for ( int i = 0; i < n; i++){
            int a = sc.nextInt();
            // a > 0, 'a' police officers were recruited
            // a < 0, a crime was committed

            if ( a > 0){
                // since 'a' police were recruited, we increment available police by a
                availablePolice += a;
            }
            else if (a < 0) {
                // crime occurs

                // if police is available then the crime is prevented
                // and available police is deducted by 1
                if (availablePolice > 0) {
                    availablePolice--;
                }
                // if police isnt available then untreated crime is incremented
                else {
                    untreatedCrime++;
                }
            }
            
        }
        System.out.println(untreatedCrime);
        sc.close();
    }
}
