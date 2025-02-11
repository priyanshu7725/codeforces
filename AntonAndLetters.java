import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);

        if(sb.isEmpty()) {
            System.out.println(0);
            sc.close();
            return;
        }

        Set <Character> charSet = new HashSet<>();
        
        for ( int i = 0; i < sb.length(); i++) {
            if ( sb.charAt(i) != ',' && sb.charAt(i) != ' ') {
                charSet.add(sb.charAt(i));
            }   
        }

        System.out.println(charSet.size());

        sc.close();
    }
}