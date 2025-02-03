import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            String str1 = sc.next();
            char f_char1 = str1.charAt(0);

            String str2 = sc.next();
            char f_char2 = str2.charAt(0);

            str1 = f_char2 + str1.substring(1);
            str2 = f_char1 + str2.substring(1);
            System.out.println(str1+ " " + str2);
        }
        
        sc.close(); 
    }
}
