import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++){
            String str = sc.next();
            int len = str.length();
            if ( len > 10){
                // we add "" so that the characters are treated as strings and  concatanated 
                // otherwise their ascii values will be taken as integers and the result will
                // be an integer that is the addition of ascii values and len-2
                System.out.println(str.charAt(0) + "" + (len-2) + str.charAt(len-1));
            }
            else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
