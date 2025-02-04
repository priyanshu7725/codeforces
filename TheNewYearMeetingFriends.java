import java.util.*;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int max = Math.max(Math.max(x1,x2),x3);
        int min = Math.min(Math.min(x1,x2),x3);

        System.out.println(max - min);

        sc.close();
    }
}
