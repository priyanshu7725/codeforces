import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int idx1 = 1;
        int idx2 = 1;

        for ( int i = 0; i < row; i++) {
            if ( i%2 == 0) {
                for (int j = 0; j < column; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            else {
                if ( i == 4*idx1 - 3) {
                    for (int j = 0; j < column; j++) {
                        if ( j == column-1) {
                            System.out.print("#");
                        }
                        else {
                            System.out.print(".");
                        }
                    }
                    idx1++;
                    System.out.println();
                }
                else if (i == 4*idx2 - 1) {
                    for (int j = 0; j < column; j++) {
                        if ( j == 0) {
                            System.out.print("#");
                        }
                        else {
                            System.out.print(".");
                        }
                    }
                    idx2++;
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}