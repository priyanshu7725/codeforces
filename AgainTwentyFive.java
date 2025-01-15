import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLong();

        // since, for any num >= 2, the last two digits are always 25
        System.out.println(25);
        
        sc.close();
    }
}
