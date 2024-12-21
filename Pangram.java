import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = sc.nextInt();
        String str = sc.next();
        str = str.toLowerCase();
        char ch = 'a';
        boolean isPangram = true;

        while(ch <= 'z'){
            if(!str.contains(String.valueOf(ch))){
                isPangram = false;
                break;
            }
            ch++;
        }

        if(isPangram){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        sc.close();
    }
}
