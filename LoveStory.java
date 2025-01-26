import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t;i++) {
            String input = sc.next();
            String target = "codeforces";
            int count = 0;

            for ( int j = 0; j < 10; j++){
                if ( input.charAt(j) != target.charAt(j)){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
