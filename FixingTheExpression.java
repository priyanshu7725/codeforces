import java.util.Scanner;

public class FixingTheExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            String str = sc.next();
            int a = str.charAt(0)-'0';
            int b = str.charAt(2)-'0';
            char oper = str.charAt(1);

            if (( oper == '<' && a<b)||( oper == '>' && a>b)||( oper == '=' && a==b)) {
                System.out.println(str);
                continue;
            }

            if ( a<b) {
                System.out.println(a+"<"+b);
            }
            else if ( a > b) {
                System.out.println(a+">"+b);
            }
            else {
                System.out.println(a+"="+a);
            }
        }
        sc.close();
    }
}
