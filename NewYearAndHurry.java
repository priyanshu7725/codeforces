import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // we first deduct k from total time, since going to the party has higher priority
        int time_rem = 240-k;
        int no_of_ques = 0;
        
        for ( int i = 1; i <= n; i++){
            // he takes 5i minutes for each question
            // where i is the question no.
            time_rem = time_rem - 5*i;

            if ( time_rem >= 0){
                // can only solve a question if time remaining is >= 0
                // Time remaining can be 0, as this already accounts for the time Limak needs to reach the party
                no_of_ques = i;
            }
            else {
                break;
            }
            
        }

        System.out.println(no_of_ques);
        sc.close();
    }
}
