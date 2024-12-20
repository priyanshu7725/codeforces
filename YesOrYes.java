import java.util.Scanner;

public class YesOrYes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String str = sc.next();

            if (str.toLowerCase().equals("yes")){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}