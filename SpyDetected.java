import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for ( int i = 0; i < t; i++) {
            
            int n = sc.nextInt();
            
            int[] arr = new int[n];

            for ( int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            int spyIdx = 0;
            int spyNeighbourIdx = 0;
            boolean spy = true;

            for (int j = 0; j < n-1; j++) {
                if ( arr[j] != arr[j+1]) {
                    spyIdx = j;
                    spyNeighbourIdx = j+1;
                    break;
                }
            }

            for ( int j = 0; j < n; j++) {
                if ( arr[j] == arr[spyIdx] && j != spyIdx) {
                    spy = false;
                    break;
                }
            }

            if (!spy) {
                System.out.println(spyNeighbourIdx+1);
            }
            else {
                System.out.println(spyIdx+1);
            }

            
        }
        sc.close();
    }
}
