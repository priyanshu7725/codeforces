import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.next();
        String host = sc.next();
        String letters = sc.next();
        String[] actual = (guest+host).split("");
        String found[] = letters.split("");
        boolean same = true;
        boolean inArr = true;

        if ( letters.length() != actual.length ){
            same = false;
        }
        else {
            for ( int i = 0; i < actual.length; i++) {
                for ( int j = 0; j < found.length; j++) {
                    if ( actual[i].equals( found[j])) {
                        actual[i] = null;
                        found[j] = null;
                        break;
                    }
                    else if ( j == found.length-1) {
                        inArr = false;
                    }
                }
                if ( !inArr) {
                    break;
                }
            }
        }

        for ( int i = 0; i < found.length; i++) {
            if ( found[i] != null) {
                same = false;
                break;
            }
        }

        if ( same) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}