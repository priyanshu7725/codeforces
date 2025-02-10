import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        int sereja = 0;
        int dima = 0;

        for ( int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        boolean serejasturn = true;

        while ( left <= right) {
            int chosenCard;

            if (cards[left] < cards[right]) {
                chosenCard = cards[right];
                right--;
            }
            else {
                chosenCard = cards[left];
                left++;
            }
                
            if ( serejasturn) {
                sereja += chosenCard;
            }
            else {
                dima += chosenCard;
            }
            serejasturn = !serejasturn;
            
        }

        System.out.println(sereja + " " + dima);

        sc.close();
        
    }
}