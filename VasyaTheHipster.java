import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int hipDay = Math.min(red, blue);
        int normal = Math.abs(red - blue) / 2;
        System.out.println(hipDay + " " + normal);
        sc.close();
    }
}