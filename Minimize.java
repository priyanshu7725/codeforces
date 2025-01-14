import java.util.Scanner;

public class Minimize {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for ( int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Since (c−a)+(b−c) = c-a+b-c = b-a
            System.out.println(b-a);
        }
        sc.close();
    }
}
