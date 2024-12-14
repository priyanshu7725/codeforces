import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        // This problem was about dividing a number(watermelon) into two even parts
        // only even numbers can be divided into two even numbers
        // 2 would be the only exception to this rule

        if ( w!=2 && w%2 == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}
